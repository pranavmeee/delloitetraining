package com.training.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {

	@Id
	@Column(name="temp")
	private int temp;
	
	private String city;
	
	private String country;

	public int getId() {
		return temp;
	}

	public void setId(int temp) {
		this.temp = temp;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString(){
		return "temp="+temp+", city="+city+", country="+country;
	}
}
