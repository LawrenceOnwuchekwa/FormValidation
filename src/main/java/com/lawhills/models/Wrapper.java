package com.lawhills.models;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class Wrapper {
	
	@Valid
	private User users;
	
	@Valid
	private Gender gerund;
	
	
	
	public Wrapper() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Wrapper(User users, Gender gerund) {
		super();
		this.users = users;
		this.gerund = gerund;
	}


	public User getUsers() {
		return users;
	}


	public void setUsers(User users) {
		this.users = users;
	}


	public Gender getGerund() {
		return gerund;
	}


	public void setGerund(Gender gerund) {
		this.gerund = gerund;
	}
	
	
	
}
