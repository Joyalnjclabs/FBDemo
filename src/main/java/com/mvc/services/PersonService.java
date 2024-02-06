package com.mvc.services;

import com.mvc.dao.PersonDao;
import com.mvc.entity.Person;

public class PersonService {
	public void saveService(Person person) {
		PersonDao dao = new PersonDao();
		dao.savePerson(person);
	}

}
