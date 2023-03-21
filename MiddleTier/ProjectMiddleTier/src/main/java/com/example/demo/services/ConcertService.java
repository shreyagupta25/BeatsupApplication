package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Area;
import com.example.demo.entities.Artist;
import com.example.demo.entities.City;
import com.example.demo.entities.Concert;
import com.example.demo.entities.Role;
import com.example.demo.entities.State;
import com.example.demo.repositories.AreaRepository;
import com.example.demo.repositories.ConcertRepository;


@Service
public class ConcertService 
{
	@Autowired
	ConcertRepository crepo;
		
	public Concert saveConcert(Concert cr)
	{
		return crepo.save(cr);
	}

	public List<Concert> viewConcerts() {
		
		return crepo.findAll();
	}

	public  Concert getConcertById(int concertid) {
		// TODO Auto-generated method stub
		return crepo.findById(concertid).get();
	}

	public int getTickets(int i) {
		
		return crepo.getTickets(i);
	}

	public int SoldTickets(int newsold, int i) {
		return crepo.SoldTickets(newsold,i);
	}
}

