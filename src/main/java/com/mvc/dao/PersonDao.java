package com.mvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mvc.entity.Person;

public class PersonDao {
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unitname");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction = entityManager.getTransaction();

public void savePerson(Person person)
{
	entityTransaction.begin();
	entityManager.persist(person);
	entityTransaction.commit();
}
}
