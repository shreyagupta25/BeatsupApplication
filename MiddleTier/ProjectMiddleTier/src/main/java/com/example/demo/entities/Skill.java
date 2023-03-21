package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="skill_master")

public class Skill {
		
	
	@Id
	int skillid;
	
	@Column
	String skillname;

	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	
	
}
