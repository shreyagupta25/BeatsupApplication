package com.example.demo.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Audience")

public class Audience {
	
	@Id
	int audid;
	
	@Column
	String fname,lname;
	
	//fk for login 
	@ManyToOne
	@JoinColumn(name="areaid")
	Area areaid;
	
	String contact;
	
	//fk for login 
	@ManyToOne
	@JoinColumn(name="loginid")
	Login loginid;
	
	

	public Audience() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Audience(String fname, String lname, Area areaid, String contact, Login loginid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.areaid = areaid;
		this.contact = contact;
		this.loginid = loginid;
	}



	public int getAudid() {
		return audid;
	}



	public void setAudid(int audid) {
		this.audid = audid;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public Area getAreaid() {
		return areaid;
	}



	public void setAreaid(Area areaid) {
		this.areaid = areaid;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public Login getLoginid() {
		return loginid;
	}



	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}
	
	
	
	
}
