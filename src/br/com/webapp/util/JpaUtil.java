package br.com.webapp.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("gerenciador");
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
