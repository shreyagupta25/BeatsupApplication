package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="artist_request")

public class ArtistRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int reqid;
	
	
	@ManyToOne
	@JoinColumn(name="artid")
	Artist artid;
	
	@ManyToOne
	@JoinColumn(name="eventid")
	
	EventInformation eventid;
	
	int status;
	
	int commercial;

	public ArtistRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	public ArtistRequest(Artist artid, EventInformation eventid, int status, int commercial) {
		super();
		this.artid = artid;
		this.eventid = eventid;
		this.status = status;
		this.commercial = commercial;
	}




	public int getReqid() {
		return reqid;
	}

	public void setReqid(int reqid) {
		this.reqid = reqid;
	}

	public Artist getArtid() {
		return artid;
	}

	public void setArtid(Artist artid) {
		this.artid = artid;
	}

	public EventInformation getEventid() {
		return eventid;
	}

	public void setEventid(EventInformation eventid) {
		this.eventid = eventid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCommercial() {
		return commercial;
	}

	public void setCommercial(int commercial) {
		this.commercial = commercial;
	}

}
