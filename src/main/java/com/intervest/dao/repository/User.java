package com.intervest.dao.repository;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class User extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -3221297891501499535L;

	@Column(unique = true)
	private String userName;

	private String firstName;

	private String lastName;

	public User() {
	}

	public User(String userName, String firstName, String lastName) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
