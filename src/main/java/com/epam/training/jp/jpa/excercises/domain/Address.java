package com.epam.training.jp.jpa.excercises.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String city;
	private String zipCode;
	private String country;
	private String street;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCountry() {
		return country;
	}

	public String getStreet() {
		return street;
	}

	public void setCountry(String readLine) {
		this.country = readLine;
	}

	public void setCity(String readLine) {
		this.city = readLine;
	}

	public void setStreet(String readLine) {
		this.street = readLine;
	}

	public void setZipCode(String readLine) {
		this.zipCode = readLine;
	}


}
