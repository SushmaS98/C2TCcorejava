package org.tns.c2tc.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration 
{
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	
	public static EntityManager getentityManager() 
	{
		entityManagerFactory = getentityManagerFactory();
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}

	private static EntityManagerFactory getentityManagerFactory()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		return entityManagerFactory;
	}

}
