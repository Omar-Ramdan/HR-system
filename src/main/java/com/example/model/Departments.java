package com.example.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
@Table(name="departments")
public class Departments {

@Id
private int ID=0;
private String DESCRIPTION_EN=null;
private String DESCRIPTION_AR=null;


public Departments(String dESCRIPTION_EN, String dESCRIPTION_AR) {
	super();
	DESCRIPTION_EN = dESCRIPTION_EN;
	DESCRIPTION_AR = dESCRIPTION_AR;
}


public int getID() {
	return ID;
}


public void setID(int iD) {
	ID = iD;
}


public String getDESCRIPTION_EN() {
	return DESCRIPTION_EN;
}


public void setDESCRIPTION_EN(String dESCRIPTION_EN) {
	DESCRIPTION_EN = dESCRIPTION_EN;
}


public String getDESCRIPTION_AR() {
	return DESCRIPTION_AR;
}


public void setDESCRIPTION_AR(String dESCRIPTION_AR) {
	DESCRIPTION_AR = dESCRIPTION_AR;
}






}
