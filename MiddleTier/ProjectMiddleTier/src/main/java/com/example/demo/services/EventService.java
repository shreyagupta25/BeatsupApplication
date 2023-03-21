package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.EventRepository;
import com.example.demo.repositories.StateRepository;
import com.example.demo.entities.EventInfo;
import com.example.demo.entities.State;
@Service
public class EventService 
{
	@Autowired
	EventRepository erepo;
	public List<EventInfo> getAll()
	{
		return erepo.findAll();
	}
	
	public EventInfo getById(int eventid)
	{
		return erepo.findById(eventid).get();
	}
	
	
}
