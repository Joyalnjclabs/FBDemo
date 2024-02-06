package com.mvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private long phno;
private String name;
private String city;
private String email;
private String pass;
@Override
public String toString() {
	return "Person [id=" + id + ", phno=" + phno + ", name=" + name + ", city=" + city + ", email=" + email + ", pass="
			+ pass + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}
