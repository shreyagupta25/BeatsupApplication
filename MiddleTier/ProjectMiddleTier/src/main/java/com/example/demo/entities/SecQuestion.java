package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="security_question")
public class SecQuestion {
	@Id
	int queid;
	
	String quetext;
	public int getQueid() {
		return queid;
	}
	public void setQueid(int queid) {
		this.queid = queid;
	}
	public String getQuetext() {
		return quetext;
	}
	public void setQuetext(String quetext) {
		this.quetext = quetext;
	}
	
	
	
}

















