package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class Area 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int areaid;
	String areaname;
	
	@ManyToOne
	@JoinColumn(name="cityid")
	City cityid;
	
	
	
	public City getCityid() {
		return cityid;
	}
	public void setCityid(City cityid) {
		this.cityid = cityid;
	}
	public int getAreaid() {
		return areaid;
	}
	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	
	
}
