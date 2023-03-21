package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="artist_skill")

public class ArtSkill {
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int artskid;
	
	
	@ManyToOne
	@JoinColumn(name="artid")
	Artist artid;
	
	@ManyToOne
	@JoinColumn(name="skillid")
	Skill skillid;

	
	
	
	public ArtSkill() {
		super();
	}

	public ArtSkill(Artist artid, Skill skillid) {
		super();
		this.artid = artid;
		this.skillid = skillid;
	}

	public int getArtskid() {
		return artskid;
	}

	public void setArtskid(int artskid) {
		this.artskid = artskid;
	}

	public Artist getArtid() {
		return artid;
	}

	public void setArtid(Artist artid) {
		this.artid = artid;
	}

	public Skill getSkillid() {
		return skillid;
	}

	public void setSkillid(Skill skillid) {
		this.skillid = skillid;
	}
	
	
	
	
}
