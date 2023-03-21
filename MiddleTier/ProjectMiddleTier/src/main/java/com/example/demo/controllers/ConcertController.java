package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.ArtSkill;
import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistReg;
import com.example.demo.entities.ArtistRequest;
import com.example.demo.entities.Audience;
import com.example.demo.entities.City;
import com.example.demo.entities.Concert;
import com.example.demo.entities.ConcertArtist;
import com.example.demo.entities.ConcertBooking;
import com.example.demo.entities.ConcertBookingdummy;
import com.example.demo.entities.Concertdummy;
import com.example.demo.entities.EventInformation;
import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;
import com.example.demo.entities.SecQuestion;
import com.example.demo.entities.Skill;
import com.example.demo.entities.State;
import com.example.demo.services.AreaService;
import com.example.demo.services.ArtistRequestService;
import com.example.demo.services.ArtistService;
import com.example.demo.services.AudienceService;
import com.example.demo.services.CityService;
import com.example.demo.services.ConcertArtistService;
import com.example.demo.services.ConcertBookingService;
import com.example.demo.services.ConcertService;
import com.example.demo.services.EventInformationService;
import com.example.demo.services.OrganizerService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ConcertController {
	@Autowired
	EventInformationService eveindoservice;
	
	@Autowired
	ArtistRequestService arreqservice;

	@Autowired
	OrganizerService oservice;
	
	@Autowired
	ConcertService cservice;
	
	@Autowired
	ConcertBookingService cbservice;
	
	@Autowired
	ConcertService conservice;

	@Autowired
	AudienceService audservice;
	
	@Autowired
	ArtistService artservice;
	
	@Autowired
	ConcertArtistService conartservice;
	
	
	
	/*@GetMapping("/getAllAreas")
	public List<Area> getAll()
	{
		return aservice.getAll();
	}
*/	
	@GetMapping("/getEventsForConcerts")
	public List<ArtistRequest> getEventsForConcerts(@RequestParam("orgid") int orgid)
	{
		Organizer organizer= oservice.getOrganizer(orgid);	
		System.out.println();
		System.out.println(orgid);
		System.out.println(organizer);
		System.out.println();
		List<ArtistRequest> ar= arreqservice.getEventsForConcerts(organizer);		
		return ar;
		
	}

	@PostMapping("/publishConcert")
	public Concert regtArtist(@RequestBody Concertdummy lr)
	{
	System.out.println(lr);
		
		EventInformation ev =eveindoservice.getEvent(lr.getEventid());
		
		Concert c=new Concert (ev,lr.getTotaltickets(),0,lr.getPrice(),lr.getDescription());
		Concert csave=cservice.saveConcert(c);
		
		//save in concert artist
		Concert conid = conservice.getConcertById(csave.getConcertid());
		Artist artid = artservice.getArtist(lr.getArtid());
		ConcertArtist ca=new ConcertArtist(artid,conid,lr.getDescription());
		
		ConcertArtist casave=conartservice.saveConcertArtist(ca);
		
		return csave;
		
	}

	@GetMapping("/viewConcerts")
	public List<ConcertArtist> viewConcerts()
	{
		List<ConcertArtist>co = conartservice.viewConcerts();
		System.out.println(co);
		return co;
	}
	
	
	@PostMapping("/bookConcert")
	public ConcertBooking  bookConcert(@RequestBody ConcertBookingdummy lr)
	{
		
		Concert conid = conservice.getConcertById(lr.getConcertid());
		Audience audid= audservice.getAudience(lr.getAudid());
		
		ConcertBooking cb =new ConcertBooking(audid,conid,lr.getNotickets()); 
		
		System.out.println(lr);
		ConcertBooking cbsave =cbservice.saveBookings(cb);
		
		
		
		//logic for sold tickets
		int totalsold=conservice.getTickets(lr.getConcertid());
		System.out.println(totalsold);
		int newsold=totalsold+lr.getNotickets();
		conservice.SoldTickets(newsold,lr.getConcertid());
		
		
		return cbsave;
	}
	
	@GetMapping("/trackConcerts")
	public List<Object[]> trackConcerts(@RequestParam("orgid") int orgid)
	{
		List<Object[]>co = conartservice.trackConcerts(orgid);
		System.out.println(co);
		return co;
	}

}
