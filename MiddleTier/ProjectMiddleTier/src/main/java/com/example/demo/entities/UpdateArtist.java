package com.example.demo.entities;

public class UpdateArtist {
	
String email,fname,lname,contact;
	
	Login loginid;

	public UpdateArtist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateArtist(String email, String fname, String lname, String contact, Login loginid) {
		super();
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.loginid = loginid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "UpdateArtist [email=" + email + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact
				+ ", loginid=" + loginid + "]";
	}
	
	
}
