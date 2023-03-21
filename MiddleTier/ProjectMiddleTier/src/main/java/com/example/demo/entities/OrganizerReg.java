package com.example.demo.entities;

public class OrganizerReg {
	
	String email,password,name,answer,contact;
	int securityid,areaid;
	
	
	

	public OrganizerReg(String email, String password, String name, String answer, String contact, int securityid,
			int areaid) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.answer = answer;
		this.contact = contact;
		this.securityid = securityid;
		this.areaid = areaid;
	}

	public OrganizerReg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSecurityid() {
		return securityid;
	}

	public void setSecurityid(int securityid) {
		this.securityid = securityid;
	}

	public String getEmail() {
		return email;
	}

	public int getAreaid() {
		return areaid;
	}

	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "OrganizerReg [email=" + email + ", password=" + password + ", name=" + name + ", answer=" + answer
				+ ", contact=" + contact + ", securityid=" + securityid + ", areaid=" + areaid + "]";
	}
	
	

}
