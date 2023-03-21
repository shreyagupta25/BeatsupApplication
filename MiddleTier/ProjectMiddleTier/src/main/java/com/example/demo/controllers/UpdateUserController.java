package com.example.demo.controllers;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Area;
import com.example.demo.entities.ArtSkill;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistReg;
import com.example.demo.entities.SecQuestion;
import com.example.demo.entities.Skill;
import com.example.demo.entities.UpdateArtist;
import com.example.demo.entities.UpdateAudience;
import com.example.demo.entities.UpdateOrganizer;
import com.example.demo.services.AreaService;
import com.example.demo.services.ArtSkillService;
import com.example.demo.services.ArtistService;
import com.example.demo.services.AudienceService;
import com.example.demo.services.LoginService;
import com.example.demo.services.OrganizerService;
import com.example.demo.services.ArtistService;
import com.example.demo.services.RoleService;
import com.example.demo.services.SecService;
import com.example.demo.services.SkillService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UpdateUserController {

	@Autowired
	ArtistService arservice;
	
	@Autowired
	ArtSkillService artskillservice;
	
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
	SkillService skservice;
	
	@Autowired
	AudienceService auservice;
	
	
	@PutMapping("/updateArtist")
	public Artist getArtist(@RequestBody UpdateArtist lr)
	{
		
		System.out.println();
		System.out.println(lr);
		System.out.println();
		int loginid=lr.getLoginid().getLoginid();
		Map<Integer,Object> result = arservice.editUser(loginid, lr);
		
		
		return null;
	}
	
	@PutMapping("/updateAudience")
	public Artist getAudience(@RequestBody UpdateAudience lr)
	{
		
		System.out.println();
		System.out.println(lr);
		System.out.println();
		int loginid=lr.getLoginid().getLoginid();
		Map<Integer,Object> result = auservice.editUser(loginid, lr);
		
		
		return null;
	}
	
	@PutMapping("/updateOrganizer")
	public Artist getOrganizer(@RequestBody UpdateOrganizer lr)
	{
		
		System.out.println();
		System.out.println(lr);
		System.out.println();
		System.out.println();
		int loginid=lr.getLoginid().getLoginid();
		Map<Integer,Object> result = oservice.editUser(loginid, lr);
		
		
		return null;
	}
	

	
}
