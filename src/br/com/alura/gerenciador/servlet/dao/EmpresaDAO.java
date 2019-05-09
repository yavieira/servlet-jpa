package br.com.alura.gerenciador.servlet.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.gerenciador.servlet.model.Empresa;
import br.com.alura.gerenciador.servlet.util.JpaUtil;


public class EmpresaDAO {
	

	public Empresa find(Integer id) {
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		Empresa empresa = em.find(Empresa.class, id);
		em.getTransaction().commit();
		em.close();
		return empresa;
	}
	
	@SuppressWarnings("unchecked")
	public List<Empresa> getEmpresas(){
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		List<Empresa> list = em.createQuery("SELECT e FROM Empresa e order by e.nome asc").getResultList();
		em.getTransaction().commit();
		em.close();
		return list;
	}
	
	public void addEmpresa(Empresa empresa) {
		
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(empresa);
		em.getTransaction().commit();
		em.close();
	}
	
	public void updateEmpresa(Empresa empresa) {
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		em.merge(empresa);
		em.getTransaction().commit();
		em.close();
	}
	
	public void removeEmpresa(Integer id) {
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		Empresa empresa = em.find(Empresa.class, id);
		em.remove(empresa);
		em.getTransaction().commit();
		em.close();
	}

}
