package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="artist_rating")
public class ArtistRating 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int artratid;
	
	@ManyToOne
	@JoinColumn(name="audid")
	Audience audid;
	
	@ManyToOne
	@JoinColumn(name="artid")
	Artist artid;
	
	int rating;
	
	String comments;

	public ArtistRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public ArtistRating(Audience audid, Artist artid, int rating, String comments) {
		super();
		this.audid = audid;
		this.artid=artid;
		this.rating = rating;
		this.comments = comments;
	}



	public int getArtratid() {
		return artratid;
	}

	public void setArtRatid(int artRatid) {
		this.artratid = artRatid;
	}

	public Audience getAudid() {
		return audid;
	}

	public void setAudid(Audience audid) {
		this.audid = audid;
	}


	

	public Artist getArtid() {
		return artid;
	}



	public void setArtid(Artist artid) {
		this.artid = artid;
	}



	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
}
