package br.com.regisnumata.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {

	private static EntityManagerFactory factory;

	public static synchronized EntityManager getInstance() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("unidade-exemplo");
		}
		return factory.createEntityManager();
	}

}
