package com.example.demo.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="concertArtist")

public class ConcertArtist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int conartid;
	
	 
	@ManyToOne
	@JoinColumn(name="artid")
	Artist artid;
	
	@ManyToOne
	@JoinColumn(name="concertid")
	Concert concertid;
	
	String performance;
	
	
	

	public ConcertArtist() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public ConcertArtist(Artist artid, Concert concertid, String performance) {
		super();
		this.artid = artid;
		this.concertid = concertid;
		this.performance = performance;
	}




	public int getConartid() {
		return conartid;
	}




	public void setConartid(int conartid) {
		this.conartid = conartid;
	}




	public Artist getArtid() {
		return artid;
	}




	public void setArtid(Artist artid) {
		this.artid = artid;
	}




	public Concert getConcertid() {
		return concertid;
	}




	public void setConcertid(Concert concertid) {
		this.concertid = concertid;
	}




	public String getPerformance() {
		return performance;
	}




	public void setPerformance(String performance) {
		this.performance = performance;
	}





	
}
