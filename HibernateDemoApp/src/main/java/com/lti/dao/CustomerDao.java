package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Customer;

public class CustomerDao {
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction tx = null;

	public void addACustomer(Customer c) {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		em.persist(c); // adds new record in DB table
		tx.commit();
	}

	public void updateACustomer(Customer c) {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		em.merge(c); // adds or update record in DB table
		tx.commit();
	}

	public Customer FindcustomerById(int customerId) {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		Customer c = em.find(Customer.class, customerId);
		return c;
	}

	public List<Customer> viewAllCustomer() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		String jpql = "select c from Customer c";
		Query query = em.createQuery(jpql);
		List<Customer> c = query.getResultList();
		return c;
	}

}
