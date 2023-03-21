package com.example.demo.controllers;

import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.entities.PassBasedEnc;
import com.example.demo.entities.SaltValue;
import com.example.demo.entities.Audience;
import com.example.demo.entities.AudienceReg;
import com.example.demo.entities.Concert;
import com.example.demo.entities.ConcertBooking;
import com.example.demo.entities.SecQuestion;
import com.example.demo.services.AreaService;
import com.example.demo.services.AudienceService;
import com.example.demo.services.ConcertBookingService;
import com.example.demo.services.ConcertService;
import com.example.demo.services.LoginService;
import com.example.demo.services.AudienceService;
import com.example.demo.services.RoleService;
import com.example.demo.services.SecService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AudienceController {

	@Autowired
	AudienceService auservice;
	
	@Autowired
	RoleService rservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	SecService sservice;
	
	@Autowired
	AreaService aservice;
	
	@Autowired
	ConcertService cservice;
	
	@Autowired
	SaltValue saltValue;
	
	@Autowired
	ConcertBookingService cbservice;
	
	
	@GetMapping("/getAudience")
	public Audience getAudience(@RequestParam("loginid") int loginid)
	{
		Login l=lservice.getById(loginid);
		System.out.println(loginid);
		return auservice.getById(l);
		
	}
	
	@PostMapping("/regAudience")
	public Audience regtAudience(@RequestBody AudienceReg lr)
	{
		System.out.println(lr);
		String encrypted = PassBasedEnc.generateSecurePassword(lr.getPassword(), saltValue.getSalt());
		com.example.demo.entities.Role r= rservice.getRole(4);
		SecQuestion sq=sservice.getSecQue(lr.getSecurityid());
	
		//***Login l=new Login(lr.getEmail(),lr.getPassword(),r,,lr.getAnswer(),0);
		
		
		Login l=new Login(lr.getEmail(),encrypted,r,sq,lr.getAnswer(),1);
		//*Login l=new Login(lr.getEmail(),lr.getPassword(),null,null,lr.getAnswer(),0);
		System.out.println("in regAudience");
		Login saved = lservice.save(l);
		
		System.out.println(lr.getAreaid());
		Area a = aservice.getArea(lr.getAreaid());
		
		Audience o=new Audience(lr.getFname(),lr.getLname(),a,lr.getContact(),saved);
		//*Audience o=new Audience(lr.getName(),null,lr.getContact(),saved);
		
		return auservice.saveAudience(o);
		
	}
	
	
	@GetMapping("/bookedTickets")
	public List<ConcertBooking> bookedTickets(@RequestParam("audid") int audid)
	{
		Audience aid=auservice.getAudience(audid);
		return cbservice.bookedTickets(aid);
		
	}
	
	
	
}
