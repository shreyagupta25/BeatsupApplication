package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.ConcertArtist;
import com.example.demo.entities.Role;
import com.example.demo.entities.State;
import com.example.demo.repositories.AreaRepository;
import com.example.demo.repositories.ConcertArtistRepository;


@Service
public class ConcertArtistService 
{
	@Autowired
	ConcertArtistRepository carepo;

	public ConcertArtist saveConcertArtist(ConcertArtist ca) {
		
		return carepo.save(ca);
		
	}

	public List<ConcertArtist> viewConcerts() {
	
		return carepo.findAll();
	}
	public List<Object[]> viewConcertsForRatings() {
		
		return carepo.viewConcertsForRatings();
	}
	
	public List<Object[]> trackConcerts(int orgid) {
		
		return carepo.trackConcert(orgid);
	}

}

