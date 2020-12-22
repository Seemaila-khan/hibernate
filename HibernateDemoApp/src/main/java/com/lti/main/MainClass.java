package com.lti.main;

import java.util.Iterator;
import java.util.List;

import com.lti.dao.PersonDao;
import com.lti.model.Person;

public class MainClass {

	public static void main(String[] args) {
		Person person = new Person();
		PersonDao dao = new PersonDao();
		/*
		 * p.setPersonId(325); p.setPersonAge(30); p.setPersonCity("Pune");
		 * p.setPersonName("NewYork"); personDao.updateAPerson(p);
		 * System.out.println("person updated");
		 */

		/*
		 * p.setPersonName("harry"); p.setPersonAge(23); p.setPersonCity("NY");
		 * personDao.addAPerson(p);
		 * 
		 * p = new Person(); p.setPersonName("ABC"); p.setPersonAge(23);
		 * p.setPersonCity("Mumbai"); personDao.addAPerson(p);
		 * 
		 * p = new Person(); p.setPersonName("BCD"); p.setPersonAge(24);
		 * p.setPersonCity("Banglore"); personDao.addAPerson(p);
		 * System.out.println("Person added successfully");
		 */
		/*
		 * Person person=dao.FindPersonById(4);
		 * System.out.println(person.getPersonName());
		 * System.out.println(person.getPersonAge());
		 */
		List<Person> persons =dao.viewAllPerson();
		Iterator<Person> items = persons.iterator();
		while(items.hasNext()) {
			Person p = items.next();
			System.out.println(p.getPersonName()+" "+p.getPersonAge());
		}
	}

}
