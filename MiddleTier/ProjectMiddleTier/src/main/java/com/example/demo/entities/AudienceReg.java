package com.example.demo.entities;

public class AudienceReg {
	
	String email,password,fname,lname,answer,contact;
	int securityid,areaid;
	public AudienceReg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AudienceReg(String email, String password, String fname, String lname, String answer, String contact,
			int securityid, int areaid) {
		super();
		this.email = email;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.answer = answer;
		this.contact = contact;
		this.securityid = securityid;
		this.areaid = areaid;
	}
	public String getEmail() {
		return email;
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
	public int getSecurityid() {
		return securityid;
	}
	public void setSecurityid(int securityid) {
		this.securityid = securityid;
	}
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
	@Override
	public String toString() {
		return "AudienceReg [email=" + email + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", answer=" + answer + ", contact=" + contact + ", securityid=" + securityid + ", areaid=" + areaid
				+ "]";
	}
	
	
	

}
