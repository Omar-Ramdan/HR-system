package com.example.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity

public class User {
   @Id
	private int id =0;
	private String name =null;
	private String username =null;
	private String password =null;
	private int age =0;
	
	
	
	public User(String name, String username, String password, int age) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", age="
				+ age + "]";
	}
	
}
