package com.example.hello.demoApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EntityClass {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String number;
	
	private String email;

	public EntityClass(Integer id, String name, String number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public EntityClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EntityClass [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + "]";
	}
	
	

}
