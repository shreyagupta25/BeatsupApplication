package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Area;
import com.example.demo.entities.ArtistRating;
import com.example.demo.entities.City;
import com.example.demo.entities.ConcertBooking;
import com.example.demo.entities.ConcertRating;
import com.example.demo.entities.Role;
import com.example.demo.entities.State;
import com.example.demo.repositories.AreaRepository;
import com.example.demo.repositories.ArtistRatingRepository;
import com.example.demo.repositories.ConcertRatingRepository;


@Service
public class ConcertRatingService 
{
	@Autowired
	ConcertRatingRepository conratrepo;

	public ConcertRating saveArtistRatings(ConcertRating ar) {
		// TODO Auto-generated method stub
		return conratrepo.save(ar);
	}
	
	
}

