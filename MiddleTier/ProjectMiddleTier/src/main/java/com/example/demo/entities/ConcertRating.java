package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="concert_rating")
public class ConcertRating 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int conratid;
	
	@ManyToOne
	@JoinColumn(name="audid")
	Audience audid;
	
	@ManyToOne
	@JoinColumn(name="cocertid")
	Concert cocertid;
	
	int rating;
	
	String comments;

	public ConcertRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcertRating(Audience audid, Concert cocertid, int rating, String comments) {
		super();
		this.audid = audid;
		this.cocertid = cocertid;
		this.rating = rating;
		this.comments = comments;
	}

	public int getArtratid() {
		return conratid;
	}

	public void setArtratid(int artratid) {
		this.conratid = artratid;
	}

	public Audience getAudid() {
		return audid;
	}

	public void setAudid(Audience audid) {
		this.audid = audid;
	}

	public Concert getCocertid() {
		return cocertid;
	}

	public void setCocertid(Concert cocertid) {
		this.cocertid = cocertid;
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
