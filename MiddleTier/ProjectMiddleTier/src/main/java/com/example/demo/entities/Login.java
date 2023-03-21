package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Login")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int loginid;
	
	String email;
	String password;
	@ManyToOne
	@JoinColumn(name="roleid")
	Role roleid;
	@ManyToOne
	@JoinColumn(name="queid")
	SecQuestion queid;
	String answer;
	int status;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String email, String password, Role roleid, SecQuestion queid, String answer, int status) {
		super();
		this.email = email;
		this.password = password;
		this.roleid = roleid;
		this.queid = queid;
		this.answer = answer;
		this.status = status;
	}

	
	

	
/*
	public Login(String email, String password, Role roleid, String answer, int status) {
		super();
		this.email = email;
		this.password = password;
		this.roleid = roleid;
		this.answer = answer;
		this.status = status;
	}

	*/

	

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
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

	public Role getRoleid() {
		return roleid;
	}

	public void setRoleid(Role roleid) {
		this.roleid = roleid;
	}

	public SecQuestion getQueid() {
		return queid;
	}

	public void setQueid(SecQuestion queid) {
		this.queid = queid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Login [loginid=" + loginid + ", email=" + email + ", password=" + password + ", roleid=" + roleid
				+ ", queid=" + queid + ", answer=" + answer + ", status=" + status + "]";
	}	
	
	
	
}
