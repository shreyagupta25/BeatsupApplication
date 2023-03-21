package com.example.demo.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="concert_booking")
public class ConcertBooking 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int bid	;
	
	

	@ManyToOne
	@JoinColumn(name="audid")
	Audience audid;
	
	
	@ManyToOne
	@JoinColumn(name="concertid")
	Concert concertid;
	
	int notickets;

	public ConcertBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcertBooking(Audience audid, Concert concertid, int notickets) {
		super();
		this.audid = audid;
		this.concertid = concertid;
		this.notickets = notickets;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Concert getConcertid() {
		return concertid;
	}

	public void setConcertid(Concert concertid) {
		this.concertid = concertid;
	}

	public int getNotickets() {
		return notickets;
	}

	public void setNotickets(int notickets) {
		this.notickets = notickets;
	}

	@Override
	public String toString() {
		return "ConcertBooking [bid=" + bid + ", audid=" + audid + ", concertid=" + concertid + ", notickets="
				+ notickets + "]";
	}
	
	
	
	
	
}
