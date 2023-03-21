package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.ArtSkill;
import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistReg;
import com.example.demo.entities.ArtistReqdummy;
import com.example.demo.entities.ArtistRequest;
import com.example.demo.entities.City;
import com.example.demo.entities.EventInformation;
import com.example.demo.entities.Login;
import com.example.demo.entities.SecQuestion;
import com.example.demo.entities.Skill;
import com.example.demo.entities.State;
import com.example.demo.services.AreaService;
import com.example.demo.services.ArtistRequestService;
import com.example.demo.services.ArtistService;
import com.example.demo.services.CityService;
import com.example.demo.services.EventInformationService;
import com.example.demo.services.OrganizerService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ArtistRequestController {
	@Autowired
	ArtistRequestService arreqservice;
	
	@Autowired
	ArtistService arservice;
	
	@Autowired
	EventInformationService eveservice;
	
	
	/*@GetMapping("/getAllAreas")
	public List<Area> getAll()
	{
		return aservice.getAll();
	}
*/	
	

	@PostMapping("/ArtistRequest")
	public ArtistRequest regtArtist(@RequestBody ArtistReqdummy lr,ArtistReqdummy lr2)
	{
		System.out.println("in artist request ");
		
		System.out.println();
		System.out.println(lr);
		System.out.println(lr2);
		
		System.out.println();
		Artist a=arservice.getArtist(lr.getArtid());
		
		EventInformation evi=eveservice.getEvent(lr.getEventid());
			
		ArtistRequest ar=new ArtistRequest(a,evi,0,lr.getCommercial());
		
		
		return arreqservice.saveArtist(ar);
		
	}
	

	
	
	@GetMapping("/ApproveArtist")
	public int approvetArtist(@RequestParam("reqid") int reqid)
	{
		
		
		System.out.println("approve artist"+ reqid);
		return arreqservice.approveArtist(reqid);
		
	}
	
	
	@GetMapping("/RejectArtist")
	public int rejectArtist(@RequestParam("reqid") int reqid)
	{
		
		
		System.out.println("rejectArtist "+ reqid);
		return arreqservice.rejectArtist(reqid);
		
	}

	@GetMapping("/ViewApproveArtist")
	public List<ArtistRequest> viewApprovetArtist()
	{
				
		System.out.println("view approve artist");
		List<ArtistRequest> ar= arreqservice.viewApproveArtist();		
		return ar;
		
	}

	@GetMapping("/ViewCancelArtist")
	public List<ArtistRequest> viewCancelArtist(@RequestParam("artid") int artid)
	{
				
		System.out.println("view cancel artist"+artid);
		Artist artist= arservice.getArtist(artid);	
		System.out.println(artist);
		List<ArtistRequest> ar= arreqservice.viewCancelArtist(artist);		
		return ar;
		
	}


	
	
	@GetMapping("/CancelArtist")
	public int canceltArtist(@RequestParam("reqid") int reqid)
	{
		
		System.out.println("cancel artist");
		
		return arreqservice.cancelArtist(reqid);
		
	}
	





	
}
