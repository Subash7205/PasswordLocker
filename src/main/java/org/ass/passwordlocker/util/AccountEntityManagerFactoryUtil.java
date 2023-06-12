package org.ass.passwordlocker.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountEntityManagerFactoryUtil {
	private static EntityManagerFactory factory;
	private AccountEntityManagerFactoryUtil() {
		
	}
	public static EntityManagerFactory getFactory() {
		if(factory==null) {
			factory=Persistence.createEntityManagerFactory("abhi");
			
		}
		return factory;
	}
}
