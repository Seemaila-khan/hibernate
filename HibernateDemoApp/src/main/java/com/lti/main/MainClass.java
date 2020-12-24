package com.lti.main;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.dao.CustomerDao;
import com.lti.dao.PersonDao;
import com.lti.model.Customer;
import com.lti.model.Person;

public class MainClass {

	public static void main(String[] args) {
////		Person p = new Person();
////		PersonDao dao = new PersonDao();
//		Customer c = new Customer();
//		CustomerDao dao_c = new CustomerDao();
//
//		c = new Customer();
//		c.setCustomerName("A");
//		c.setCustomerCity("indore");
//		c.setCustomerAge(22);
//		dao_c.addACustomer(c);
//		System.out.println("customer added successfully");
//
//		c = new Customer();
//		c.setCustomerName("B");
//		c.setCustomerAge(45);
//		c.setCustomerCity("Pune");
//		c.setCustomerName("C");
//		dao_c.updateACustomer(c);
//		System.out.println("person updated");
//		
//		Customer cus =dao_c.FindcustomerById(101);
//		 System.out.println(cus.getCustomerName());
//		 System.out.println(cus.getCustomerAge());
////		  p.setPersonId(325); p.setPersonAge(30); p.setPersonCity("Pune");
////		  p.setPersonName("NewYork"); personDao.updateAPerson(p);
////		  System.out.println("person updated");
//
//		/*
//		 * p.setPersonName("harry"); p.setPersonAge(23); p.setPersonCity("NY");
//		 * personDao.addAPerson(p);
//		 * 
//		 * p = new Person(); p.setPersonName("ABC"); p.setPersonAge(23);
//		 * p.setPersonCity("Mumbai"); personDao.addAPerson(p);
//		 * 
//		 * p = new Person(); p.setPersonName("BCD"); p.setPersonAge(24);
//		 * p.setPersonCity("Banglore"); personDao.addAPerson(p);
//		 * System.out.println("Person added successfully");
//		 */
//		/*
//		 * Person person=dao.FindPersonById(4);
//		 * System.out.println(person.getPersonName());
//		 * System.out.println(person.getPersonAge());
//		 */
//		List<Customer> persons =dao_c.viewAllCustomer();
//		Iterator<Customer> items = p.iterator();
//		while(items.hasNext()) {
//			Customer c = items.next();
//			System.out.println(c.customerName()+" "+p.getPersonAge());
//		}
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
//		em.persist(person); // adds new record in DB table
		tx.commit();
	}

}
