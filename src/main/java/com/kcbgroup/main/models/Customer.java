package com.kcbgroup.main.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** @Author Nephat Mutugi
 * This can be ranked as a bean*/
@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(insertable = false)
	private int CID;
	
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String kra_pin;
	@Column
	private String address;

	public Customer() {

	}

	public Customer(String first_name, String last_name, String kra_pin, String address) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.kra_pin = kra_pin;
		this.address = address;
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int CID) {
		this.CID = CID;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String FIRST_NAME) {
		this.first_name = FIRST_NAME;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String LAST_NAME) {
		this.last_name = LAST_NAME;
	}

	public String getKra_pin() {
		return kra_pin;
	}

	public void setKra_pin(String KRA_PIN) {
		this.kra_pin = KRA_PIN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String ADDRESS) {
		this.address = ADDRESS;
	}

	@Override
	public String toString() {
		return "\nCustomer{" +
				"CID=" + CID +
				", first_name='" + first_name + '\'' +
				", last_name='" + last_name + '\'' +
				", kra_pin='" + kra_pin + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
