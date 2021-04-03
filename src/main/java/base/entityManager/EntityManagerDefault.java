package base.entityManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerDefault {
	
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static EntityManager get() {
		return entityManager;
	}

}
