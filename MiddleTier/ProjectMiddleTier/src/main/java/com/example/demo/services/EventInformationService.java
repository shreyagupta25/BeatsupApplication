package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Artist;
import com.example.demo.entities.EventInformation;
import com.example.demo.repositories.EventInformationRepository;



@Service
public class EventInformationService
{
	@Autowired
	EventInformationRepository einforepo;
	
	public List<EventInformation> getAll()
	{
		System.out.println("in re"+einforepo.findAll());
		return einforepo.findAll();
	}
	
	public EventInformation saveEvent(EventInformation e)
	{
		return einforepo.save(e);
}

	public EventInformation getEvent(int eventid) {
		// TODO Auto-generated method stub
		return einforepo.findById(eventid).get();
	}

	
}
