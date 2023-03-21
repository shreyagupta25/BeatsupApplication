package com.example.demo.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="artist")

public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int artid;
	
	@Column
	String fname,lname;
	
	//fk for login 
	@ManyToOne
	@JoinColumn(name="areaid")
	Area areaid;
	
	String contact;
	
	byte[] image;
	
	//fk for login 
	@ManyToOne
	@JoinColumn(name="loginid")
	Login loginid;
	
	

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Artist(String fname, String lname, Area areaid, String contact, Login loginid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.areaid = areaid;
		this.contact = contact;
		
		this.loginid = loginid;
	}



	public int getArtid() {
		return artid;
	}



	public void setArtid(int artid) {
		this.artid = artid;
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



	public byte[] getImage() {
		return image;
	}



	public void setImage(byte[] image) {
		this.image = image;
	}



	public Login getLoginid() {
		return loginid;
	}



	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}



	@Override
	public String toString() {
		return "Artist [artid=" + artid + ", fname=" + fname + ", lname=" + lname + ", areaid=" + areaid + ", contact="
				+ contact + ", image=" + Arrays.toString(image) + ", loginid=" + loginid + "]";
	}

	
}
