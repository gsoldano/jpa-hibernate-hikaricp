package base;

import java.util.List;

import javax.persistence.EntityManager;

import base.entity.Customer;
import base.entityManager.EntityManagerDefault;
import base.loggerManager.LoggerManagerDefault;

public class Main {

	public static void main(String[] args) {
		LoggerManagerDefault.get();
		EntityManager entityManager = EntityManagerDefault.get();
		List<Customer> customers = entityManager.createQuery("from Customer", Customer.class).getResultList();
		customers.forEach(customer -> System.out.println(customer.getCompanyName()));
	}

}
