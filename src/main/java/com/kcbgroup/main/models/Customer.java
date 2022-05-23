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
	private String ADDRESS;
	
	
}
