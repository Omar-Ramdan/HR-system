package com.example.model;

import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;  
import java.nio.charset.StandardCharsets;  
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  


@Entity
@Table(name="users")
public class Users {
   @Id
	private int ID =0;
	private String FIRST_NAME_EN =null;
	private String FIRST_NAME_AR =null;
	private String LAST_NAME_EN =null;
	private String LAST_NAME_AR =null;
	private String USERNAME =null;
	private int PHONE=0;
	private int AGE =0;
	private String PASSWORD =null;
	

	
	 public static byte[] getSHA(String input) throws      NoSuchAlgorithmException {  
		 // The Static method " getInstance() " is called to initiate hashing with SHA  
		        MessageDigest md = MessageDigest.getInstance("SHA-256");  
		  
		        // The static method called in the JAVA program  
		        // for calculating the message digest of a given input  
		        // and results in an array of byte  
		        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
		    }
	
	    public static String toHexString(byte[] hash) {  
	        // calling the " BigInteger " function in JAVA programming language.  
	        BigInteger number = new BigInteger(1, hash);  
	  
	        // Converting the message digest into a Hexa decimal value.  
	        StringBuilder hexString = new StringBuilder(number.toString(16));  
	  
	        while (hexString.length() < 64) {  
	            hexString.insert(0, '0');  
	        }  
	  
	        return hexString.toString();  
	    }  
	
	
	
	
	public Users(String fIRST_NAME_EN, String fIRST_NAME_AR, String lAST_NAME_EN, String lAST_NAME_AR, String uSERNAME,
			int pHONE, int aGE, String pASSWORD) {
		super();
		FIRST_NAME_EN = fIRST_NAME_EN;
		FIRST_NAME_AR = fIRST_NAME_AR;
		LAST_NAME_EN = lAST_NAME_EN;
		LAST_NAME_AR = lAST_NAME_AR;
		USERNAME = uSERNAME;
		PHONE = pHONE;
		AGE = aGE;
		try {
			PASSWORD =  toHexString(getSHA(pASSWORD));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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


	public String getUSERNAME() {
		return USERNAME;
	}


	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}


	public int getPHONE() {
		return PHONE;
	}


	public void setPHONE(int pHONE) {
		PHONE = pHONE;
	}


	public int getAGE() {
		return AGE;
	}


	public void setAGE(int aGE) {
		AGE = aGE;
	}


	public String getPASSWORD() {
		return PASSWORD;
	}


	public void setPASSWORD(String pASSWORD) {
		try {
			PASSWORD = toHexString(getSHA(pASSWORD));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
