package com.example.demo.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "event_information")
public class EventInformation 
{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eventid;


	
	
	@ManyToOne
	@JoinColumn(name="orgid")
	Organizer orgid;
	
	
	String eventname;
	
	
	Date eventtime;
	
	String eventaddress;
	
	@ManyToOne
	@JoinColumn(name="eventloc")
	Area eventloc;

	
	
	
	
	public EventInformation() {
		super();
		// TODO Auto-generated constructor stub
	}





	public EventInformation(Organizer orgid, String eventname, Date eventtime, String eventaddress, Area eventloc) {
		super();
		this.orgid = orgid;
		this.eventname = eventname;
		this.eventtime = eventtime;
		this.eventaddress = eventaddress;
		this.eventloc = eventloc;
	}





	public int getEventid() {
		return eventid;
	}





	public void setEventid(int eventid) {
		this.eventid = eventid;
	}





	public Organizer getOrgid() {
		return orgid;
	}





	public void setOrgid(Organizer orgid) {
		this.orgid = orgid;
	}





	public String getEventname() {
		return eventname;
	}





	public void setEventname(String eventname) {
		this.eventname = eventname;
	}





	public Date getEventtime() {
		return eventtime;
	}





	public void setEventtime(Date eventtime) {
		this.eventtime = eventtime;
	}





	public String getEventaddress() {
		return eventaddress;
	}





	public void setEventaddress(String eventaddress) {
		this.eventaddress = eventaddress;
	}





	public Area getEventloc() {
		return eventloc;
	}





	public void setEventloc(Area eventloc) {
		this.eventloc = eventloc;
	}





	@Override
	public String toString() {
		return "EventInformation [eventid=" + eventid + ", orgid=" + orgid + ", eventname=" + eventname + ", eventtime="
				+ eventtime + ", eventaddress=" + eventaddress + ", eventloc=" + eventloc + "]";
	}

	


	
	
	
		

}
