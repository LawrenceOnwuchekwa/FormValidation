package com.lawhills.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
	@NotNull
	@NotBlank
	@Size(min=3, max = 15, message="name must be between 3 and 15 characters")
	private String firstname;
	@NotNull
	@NotBlank
	@Size(min=3, max = 15, message="name must be between 3 and 15 characters")
	private String lastname;
	@Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 90, message = "Age should not be greater than 90")
	private byte age;
	@Email
	@NotBlank
	private String email;
	private String country;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String lastname, byte age, String email, String country) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", email=" + email
				+ ", country=" + country + "]";
	}
	
	

}
