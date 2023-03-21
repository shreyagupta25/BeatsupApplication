package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Area;
import com.example.demo.entities.ArtSkill;
import com.example.demo.entities.Login;
import com.example.demo.entities.LoginCheck;
import com.example.demo.entities.PassBasedEnc;
import com.example.demo.entities.SaltValue;
import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistReg;
import com.example.demo.entities.SecQuestion;
import com.example.demo.entities.Skill;
import com.example.demo.services.AreaService;
import com.example.demo.services.ArtSkillService;
import com.example.demo.services.ArtistService;
import com.example.demo.services.LoginService;
import com.example.demo.services.ArtistService;
import com.example.demo.services.RoleService;
import com.example.demo.services.SecService;
import com.example.demo.services.SkillService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ArtistController {

	@Autowired
	ArtistService arservice;
	
	@Autowired
	ArtSkillService artskillservice;
	
	
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
	SaltValue saltValue;
	
	
	@GetMapping("/getArtist")
	public Artist getArtist(@RequestParam("loginid") int loginid)
	{
		Login l=lservice.getById(loginid);
		System.out.println(loginid);
		return arservice.getById(l);
		
	}

	@PostMapping("/regArtist")
	public Artist regtArtist(@RequestBody ArtistReg lr)
	{
		System.out.println(lr);
		
		System.out.println(saltValue.getSalt());
		String encrypted = PassBasedEnc.generateSecurePassword(lr.getPassword(), saltValue.getSalt());
		com.example.demo.entities.Role r= rservice.getRole(3);
		SecQuestion sq=sservice.getSecQue(lr.getSecurityid());
	
		//***Login l=new Login(lr.getEmail(),lr.getPassword(),r,,lr.getAnswer(),0);
		
		
		Login l=new Login(lr.getEmail(),encrypted,r,sq,lr.getAnswer(),1);
		//*Login l=new Login(lr.getEmail(),lr.getPassword(),null,null,lr.getAnswer(),0);
		System.out.println("in regArtist");
		Login saved = lservice.save(l);//save in login table
		
		System.out.println(lr.getAreaid());
		Area a = aservice.getArea(lr.getAreaid());
		
		
		//Add state into ArtistReg class for image and replace below null with that
		
		Artist o=new Artist(lr.getFname(),lr.getLname(),a,lr.getContact(),saved);
		Artist asaved=arservice.saveArtist(o);//save in artist table
		
		Artist ar = arservice.getArtist(asaved.getArtid());
		
		Skill sk = skservice.getSkill(lr.getSkillid());
		
		ArtSkill artsk = new ArtSkill (ar,sk);
		
		
		artskillservice.saveArtist(artsk);//save in artist -skill table
		return asaved;
		
	}

	

	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping(value = "/uploadImage/{artid}",consumes="multipart/form-data")
	public boolean uploadImage(@PathVariable("artid") int artid,@RequestBody MultipartFile file )
	{
		System.out.println("IN IMAGE ");
		
		boolean flag=true;
		try
		{
			flag = arservice.upload(artid, file.getBytes());
		}
		catch(Exception e)
		{
			flag =false;
		}
		return flag;
	}

	@GetMapping("/getAllArtist")
	public List <Artist> getAllArtist()
	{
		return arservice.getAllArtist();
		
	}

	
	
	
}
