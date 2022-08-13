package org.tns.c2tc.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration 
{
	private static EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;
	
	public static void getEntitymanagerFactory()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager()
	{
		getEntitymanagerFactory();
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
}
