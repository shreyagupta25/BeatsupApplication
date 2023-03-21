package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="event_information")

public class EventInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eventid; 
	
	@Column
	String eventname;
	
	String eventloc;
	
	//fk for login 
	@ManyToOne
	@JoinColumn(name="orgid")
	Organizer orgid;
	
	@JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss")
	Date eventtime;

	public EventInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEventid() {
		return eventid;
	}

	public void setEventid(int eventid) {
		this.eventid = eventid;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	public String getEventloc() {
		return eventloc;
	}

	public void setEventloc(String eventloc) {
		this.eventloc = eventloc;
	}

	public Organizer getOrgid() {
		return orgid;
	}

	public void setOrgid(Organizer orgid) {
		this.orgid = orgid;
	}

	public Date getEventtime() {
		return eventtime;
	}

	public void setEventtime(Date eventtime) {
		this.eventtime = eventtime;
	}
	
	

}
