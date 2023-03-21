package com.example.demo.entities;

public class UpdateOrganizer {
	String email,name,contact;
	
	Login loginid;
	
	public UpdateOrganizer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public UpdateOrganizer(String email, String name, String contact, Login loginid) {
		super();
		this.email = email;
		this.name = name;
		this.contact = contact;
		this.loginid = loginid;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "UpdateOrganizer [email=" + email + ", name=" + name + ", contact=" + contact + ", loginid=" + loginid
				+ "]";
	}



	
	

}
