package br.com.alura.gerenciador.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.util.JpaUtil;


public class EmpresaDAO {
	
	@SuppressWarnings("unchecked")
	public List<Empresa> getEmpresas(){
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		List<Empresa> list = em.createQuery("SELECT e FROM Empresa e").getResultList();
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
}
