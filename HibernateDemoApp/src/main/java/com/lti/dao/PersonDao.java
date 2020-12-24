package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Person;

public class PersonDao {

	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction tx = null;

//	public void addAPerson(Person person) {
//		emf = Persistence.createEntityManagerFactory("pu");
//		em = emf.createEntityManager();
//		tx = em.getTransaction();
//		tx.begin();
//		em.persist(person); // adds new record in DB table
//		tx.commit();
//	}

//	public void addOrUpdateAPerson(Person person) {
//		emf = Persistence.createEntityManagerFactory("pu");
//		em = emf.createEntityManager();
//		tx = em.getTransaction();
//		tx.begin();
//		em.persist(person); // adds or update record in DB table
//		tx.commit();
//	}
	public void addOrUpdateAPerson(Person person) {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
		em.merge(person); // adds or update record in DB table
		tx.commit();
	}

	public Person FindPersonById(int personId) {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		Person person = em.find(Person.class, personId);
		return person;
	}

	public List<Person> viewAllPerson() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		String jpql = "select p from Person p";
		Query query = em.createQuery(jpql);
		List<Person> persons = query.getResultList();
		return persons;
	}
}
