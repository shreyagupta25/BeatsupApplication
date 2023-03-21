package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Area;
import com.example.demo.entities.Artist;
import com.example.demo.entities.Audience;
import com.example.demo.entities.City;
import com.example.demo.entities.Concert;
import com.example.demo.entities.ConcertBooking;
import com.example.demo.entities.Role;
import com.example.demo.entities.State;
import com.example.demo.repositories.AreaRepository;
import com.example.demo.repositories.ConcertBookingRepository;
import com.example.demo.repositories.ConcertRepository;


@Service
public class ConcertBookingService 
{
	@Autowired
	ConcertBookingRepository crepo;
	


	public ConcertBooking saveBookings(ConcertBooking lr) {
		// TODO Auto-generated method stub
		return crepo.save(lr);
	}

	public List<ConcertBooking> bookedTickets(Audience aid) {
		
		return crepo.bookedTickets(aid);
	}
	
	
	

}

