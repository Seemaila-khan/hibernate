package com.lti.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Person;

public class PersistentDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//transient state
		System.out.println("--------------transient state-------------");

		Person person = new Person();
		person.setPersonName("jack");
		person.setPersonAge(35);
		person.setPersonCity("Sydney");
		System.out.println(person);
		System.out.println("--------------persistent state-------------");
		
		em.persist(person);// object person is in persistent state
		System.out.println(person);
		person.setPersonCity("california"); //changes reflected in the object person
		person.setPersonCity("London");
		tx.commit();


	}

}
