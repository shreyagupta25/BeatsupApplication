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
import com.example.demo.entities.Organizer;
import com.example.demo.entities.OrganizerReg;
import com.example.demo.entities.PassBasedEnc;
import com.example.demo.entities.SaltValue;
import com.example.demo.entities.SecQuestion;
import com.example.demo.services.AreaService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrganizerService;
import com.example.demo.services.RoleService;
import com.example.demo.services.SecService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrganizerController {

	@Autowired
	OrganizerService oservice;
	
	@Autowired
	RoleService rservice;
	
	@Autowired
	LoginService lservice;
	
	@Autowired
	SecService sservice;
	
	@Autowired
	AreaService aservice;
	
	@Autowired
	SaltValue saltValue;
	
	@GetMapping("/getAllOrganizer")
	public List<Organizer> getAllOrganizer()
	{
		return oservice.getAllOrganizer();
	}

	@GetMapping("/getOrganizer")
	public Organizer getOrganizer(@RequestParam("loginid") int loginid)
	{
		Login l=lservice.getById(loginid);
		System.out.println(loginid);
		return oservice.getById(l);
		
	}
	
	@PostMapping("/regOrganizer")
	public Organizer regtOrganizer(@RequestBody OrganizerReg lr)
	{
		System.out.println(lr);
		String encrypted = PassBasedEnc.generateSecurePassword(lr.getPassword(), saltValue.getSalt());
		com.example.demo.entities.Role r= rservice.getRole(2);
		SecQuestion sq=sservice.getSecQue(lr.getSecurityid());
	
	
		
		
		Login l=new Login(lr.getEmail(),encrypted,r,sq,lr.getAnswer(),0);
		//*Login l=new Login(lr.getEmail(),lr.getPassword(),null,null,lr.getAnswer(),0);
		System.out.println("in regorganizer");
		Login saved = lservice.save(l);
		
		System.out.println(lr.getAreaid());
		Area a = aservice.getArea(lr.getAreaid());
		
		Organizer o=new Organizer(lr.getName(),a,lr.getContact(),saved);
		//*Organizer o=new Organizer(lr.getName(),null,lr.getContact(),saved);
		
		return oservice.saveOrganizer(o);
		
	}
	
}
