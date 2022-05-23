package com.kcbgroup.main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int CID;
	
	@Column
	private String FIRST_NAME;
	@Column
	private String LAST_NAME;
	@Column
	private String KRA_PIN;
	@Column
	private String ADDRESS;

	public Customer() {

	}

	public Customer(String FIRST_NAME, String LAST_NAME, String KRA_PIN, String ADDRESS) {
		this.FIRST_NAME = FIRST_NAME;
		this.LAST_NAME = LAST_NAME;
		this.KRA_PIN = KRA_PIN;
		this.ADDRESS = ADDRESS;
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int CID) {
		this.CID = CID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String FIRST_NAME) {
		this.FIRST_NAME = FIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}

	public String getKRA_PIN() {
		return KRA_PIN;
	}

	public void setKRA_PIN(String KRA_PIN) {
		this.KRA_PIN = KRA_PIN;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}
}
