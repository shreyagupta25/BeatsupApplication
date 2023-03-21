package com.example.demo.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PostEvents {
	
	String ename,area;
	int state,city,areaid,skillid,ono,charges;

	//@JsonFormat(pattern = "yyyy-mm-ddThh:mm:ss")
	String date;
	public PostEvents() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}
	public int getOno() {
		return ono;
	}



	public void setOno(int ono) {
		this.ono = ono;
	}



	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getAreaid() {
		return areaid;
	}

	public void setAreaid(int areaid) {
		this.areaid = areaid;
	}

	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}


	public int getCharges() {
		return charges;
	}


	public void setCharges(int charges) {
		this.charges = charges;
	}


	@Override
	public String toString() {
		return "PostEvents [ename=" + ename + ", area=" + area + ", state=" + state + ", city=" + city + ", areaid="
				+ areaid + ", skillid=" + skillid + ", ono=" + ono + ", charges=" + charges + ", date=" + date + "]";
	}






	

}
