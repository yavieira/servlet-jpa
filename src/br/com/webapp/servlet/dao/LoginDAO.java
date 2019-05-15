package br.com.webapp.servlet.dao;

import javax.persistence.EntityManager;

import br.com.webapp.servlet.model.User;
import br.com.webapp.util.JpaUtil;

public class LoginDAO {

	public User find(String nome) {
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		User user = em.find(User.class, nome);
		em.getTransaction().commit();
		em.close();
		return user;
	}
	
	public void add(User user) {
		EntityManager em = new JpaUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}
}
