package org.ass.passwordlocker.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserEntityManagerFactoryutil {
	private static EntityManagerFactory factory;
	private  UserEntityManagerFactoryutil() {
		
		
	}
	public static EntityManagerFactory getFactory() {
		if(factory==null) {
			factory=Persistence.createEntityManagerFactory("abhi");
			
		}
		return factory;
	}
}
