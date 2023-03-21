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
import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistRating;
import com.example.demo.entities.ArtistRatingdummy;
import com.example.demo.entities.Audience;
import com.example.demo.entities.City;
import com.example.demo.entities.Concert;
import com.example.demo.entities.ConcertBooking;
import com.example.demo.entities.ConcertBookingdummy;
import com.example.demo.entities.ConcertRating;
import com.example.demo.entities.State;
import com.example.demo.services.AreaService;
import com.example.demo.services.ArtistRatingService;
import com.example.demo.services.ArtistService;
import com.example.demo.services.AudienceService;
import com.example.demo.services.CityService;
import com.example.demo.services.ConcertArtistService;
import com.example.demo.services.ConcertRatingService;
import com.example.demo.services.ConcertService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class RatingController {
	
	@Autowired
	ArtistRatingService artratservice;
	
	@Autowired
	AudienceService audservice;
	
	@Autowired
	ConcertService conservice;
	
	@Autowired
	ArtistService arservice;
	
	@Autowired
	ConcertRatingService conratservice;
	
	@Autowired
	ConcertArtistService conartservice;
	
	@PostMapping("/artistRating")
	public ArtistRating  artistRating(@RequestBody ArtistRatingdummy lr)
	{
		Audience audid =audservice.getAudience(lr.getAudid()); 
		Artist artid=arservice.getArtist(lr.getArtid());
		
		ArtistRating ar=new ArtistRating(audid,artid,lr.getRating(),lr.getComments());
		
		return artratservice.saveArtistRatings(ar);
	}
	
	@PostMapping("/concerttRating")
	public ConcertRating  concertRating(@RequestBody ArtistRatingdummy lr)
	{
		Audience audid =audservice.getAudience(lr.getAudid()); 
		Concert conid=conservice.getConcertById(lr.getConcertid());
		
		ConcertRating ar=new ConcertRating(audid,conid,lr.getRating(),lr.getComments());
		
		return conratservice.saveArtistRatings(ar);
	}
	
	@GetMapping("/viewConcertsForRatings")
	public List<Object[]> viewConcertsForRatings()
	{
		List<Object[]>co = conartservice.viewConcertsForRatings();
		System.out.println(co);
		return co;
	}

	
}
