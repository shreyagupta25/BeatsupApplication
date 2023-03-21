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

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.services.SkillService;

@Entity
@Table(name="event_skill")
public class EventSkill 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int eventskid;
	
	@OneToOne
	@JoinColumn(name="eventid")
	EventInformation eventid;
	
	@ManyToOne
	@JoinColumn(name="skillid")
	Skill skillid;
	
	@Column
	int max;
	

	
	
	public EventSkill(EventInformation eventid, Skill skillid, int max) {
		super();
		this.eventid = eventid;
		this.skillid = skillid;
		this.max = max;
	}

	public EventSkill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEventskid() {
		return eventskid;
	}

	public void setEventskid(int eventskid) {
		this.eventskid = eventskid;
	}

	public EventInformation getEventid() {
		return eventid;
	}

	public void setEventid(EventInformation eventid) {
		this.eventid = eventid;
	}

	public Skill getSkillid() {
		return skillid;
	}

	public void setSkillid(Skill skillid) {
		this.skillid = skillid;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	
	
	
	
}
