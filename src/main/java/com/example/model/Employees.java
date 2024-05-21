package com.example.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java. util. Date;


@Entity
@Table(name="employees")
public class Employees {
	@Id
	private int ID =0;
	private String FIRST_NAME_EN =null;
	private String FIRST_NAME_AR =null;
	private String LAST_NAME_EN =null;
	private String LAST_NAME_AR =null;
	private int AGE =0;
	private String ADDRESS =null;
	private String PHONE_NUMBER =null;
	private String EMAIL =null;
	private int SALARY =0;
	private String JOB_DESCRIPTION =null;
	private int MANAGER_ID =0;
	private int TITEL_ID =0;
	private int DEPARTMENT_ID =0;
	private int USER_ID =0;
    private Date JOIN_DATE= null;
    
    
	public Employees(String fIRST_NAME_EN, String fIRST_NAME_AR, String lAST_NAME_EN, String lAST_NAME_AR, int aGE,
			String aDDRESS, String pHONE_NUMBER, String eMAIL, int sALARY, String jOB_DESCRIPTION, int mANAGER_ID,
			int tITEL_ID, int dEPARTMENT_ID, int uSER_ID, Date jOIN_DATE) {
		super();
		FIRST_NAME_EN = fIRST_NAME_EN;
		FIRST_NAME_AR = fIRST_NAME_AR;
		LAST_NAME_EN = lAST_NAME_EN;
		LAST_NAME_AR = lAST_NAME_AR;
		AGE = aGE;
		ADDRESS = aDDRESS;
		PHONE_NUMBER = pHONE_NUMBER;
		EMAIL = eMAIL;
		SALARY = sALARY;
		JOB_DESCRIPTION = jOB_DESCRIPTION;
		MANAGER_ID = mANAGER_ID;
		TITEL_ID = tITEL_ID;
		DEPARTMENT_ID = dEPARTMENT_ID;
		USER_ID = uSER_ID;
		JOIN_DATE = jOIN_DATE;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getFIRST_NAME_EN() {
		return FIRST_NAME_EN;
	}


	public void setFIRST_NAME_EN(String fIRST_NAME_EN) {
		FIRST_NAME_EN = fIRST_NAME_EN;
	}


	public String getFIRST_NAME_AR() {
		return FIRST_NAME_AR;
	}


	public void setFIRST_NAME_AR(String fIRST_NAME_AR) {
		FIRST_NAME_AR = fIRST_NAME_AR;
	}


	public String getLAST_NAME_EN() {
		return LAST_NAME_EN;
	}


	public void setLAST_NAME_EN(String lAST_NAME_EN) {
		LAST_NAME_EN = lAST_NAME_EN;
	}


	public String getLAST_NAME_AR() {
		return LAST_NAME_AR;
	}


	public void setLAST_NAME_AR(String lAST_NAME_AR) {
		LAST_NAME_AR = lAST_NAME_AR;
	}


	public int getAGE() {
		return AGE;
	}


	public void setAGE(int aGE) {
		AGE = aGE;
	}


	public String getADDRESS() {
		return ADDRESS;
	}


	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}


	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}


	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}


	public String getEMAIL() {
		return EMAIL;
	}


	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}


	public int getSALARY() {
		return SALARY;
	}


	public void setSALARY(int sALARY) {
		SALARY = sALARY;
	}


	public String getJOB_DESCRIPTION() {
		return JOB_DESCRIPTION;
	}


	public void setJOB_DESCRIPTION(String jOB_DESCRIPTION) {
		JOB_DESCRIPTION = jOB_DESCRIPTION;
	}


	public int getMANAGER_ID() {
		return MANAGER_ID;
	}


	public void setMANAGER_ID(int mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}


	public int getTITEL_ID() {
		return TITEL_ID;
	}


	public void setTITEL_ID(int tITEL_ID) {
		TITEL_ID = tITEL_ID;
	}


	public int getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}


	public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}


	public int getUSER_ID() {
		return USER_ID;
	}


	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}


	public Date getJOIN_DATE() {
		return JOIN_DATE;
	}


	public void setJOIN_DATE(Date jOIN_DATE) {
		JOIN_DATE = jOIN_DATE;
	}
    
    
    
	

}
