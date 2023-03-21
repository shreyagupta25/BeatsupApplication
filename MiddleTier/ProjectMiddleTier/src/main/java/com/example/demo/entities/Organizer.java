package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Organizer")

public class Organizer {
	
	@Id
	int orgid;
	
	@Column
	String name;
	
	//fk for login 
	@ManyToOne
	@JoinColumn(name="areaid")
	Area areaid;
	
	String contact;
	
	//fk for login 
	@ManyToOne
	@JoinColumn(name="loginid")
	Login loginid;
	
	

	public Organizer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/*public Organizer(String name, Area areaid, String contact) {
		super();
		this.name = name;
		this.areaid = areaid;
		this.contact = contact;
	}*/
	



	public Organizer(String name, Area areaid, String contact, Login loginid) {
		super();
		this.name = name;
		this.areaid = areaid;
		this.contact = contact;
		this.loginid = loginid;
	}



	public Organizer(String name2, Object object, String contact2, Login saved) {
		// TODO Auto-generated constructor stub
	}



	public int getOrgid() {
		return orgid;
	}

	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
