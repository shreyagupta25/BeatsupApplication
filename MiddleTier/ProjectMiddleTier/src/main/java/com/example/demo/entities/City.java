package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int cityid;
	String cityname;
	
	@ManyToOne
	@JoinColumn(name="stateid")
	State stateid;

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public State getStateid() {
		return stateid;
	}

	public void setStateid(State stateid) {
		this.stateid = stateid;
	}

}
