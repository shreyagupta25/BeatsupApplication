package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="concert")
public class Concert 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int concertid;
	
	@OneToOne
	@JoinColumn(name="eventid")
	EventInformation eventid;
	
	int totaltickets,soldtickets,price; 
	
	String description;

	public Concert() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Concert( EventInformation eventid, int totaltickets, int soldtickets, int price,
			String description) {
		super();

		this.eventid = eventid;
		this.totaltickets = totaltickets;
		this.soldtickets = soldtickets;
		this.price = price;
		this.description = description;
	}

	public int getConcertid() {
		return concertid;
	}

	public void setConcertid(int concertid) {
		this.concertid = concertid;
	}

	public EventInformation getEventid() {
		return eventid;
	}

	public void setEventid(EventInformation eventid) {
		this.eventid = eventid;
	}

	public int getTotaltickets() {
		return totaltickets;
	}

	public void setTotaltickets(int totaltickets) {
		this.totaltickets = totaltickets;
	}

	public int getSoldtickets() {
		return soldtickets;
	}

	public void setSoldtickets(int soldtickets) {
		this.soldtickets = soldtickets;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
		
}
