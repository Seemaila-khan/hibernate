package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.PersonDao;
import com.lti.model.Person;

public class PersonTest {

	PersonDao personDao = new PersonDao();

	@Test
	public void addAPerson() {
		Person person = new Person();
		person.setPersonName("jacob");
		person.setPersonCity("mumbai");
		person.setPersonAge(20);
		personDao.addOrUpdateAPerson(person);
	}

	@Test
	public void updateAPerson() {
		Person person = new Person();
		person.setPersonId(1002);
		person.setPersonName("jacob");
		person.setPersonCity("maxico");
		person.setPersonAge(30);
		personDao.addOrUpdateAPerson(person);
	}

}
