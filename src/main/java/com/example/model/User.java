package com.example.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
@Table(name="user")
public class User {
   @Id
	private int id =0;
	private String fristName =null;
	private String lastName =null;
	private String username =null;
	private int phone=0;
	private int age =0;
	private String password =null;
	

	
	public User(String fristName, String lastName, String username, int phone, int age, String password) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.username = username;
		this.phone = phone;
		this.age = age;
		this.password = password;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", FristName=" + fristName + ", LastName=" + lastName + ", username=" + username
				+ ", age=" + age + ", password=" + password + "]";
	}


	

	
}
