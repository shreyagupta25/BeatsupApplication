package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EventInformation;
import com.example.demo.services.EventInformationService;



/*
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class EventInformationController 
{
	@Autowired
	EventInformationService eventinfoservice;
	
	@GetMapping("/getAllEvents")
	public List<EventInformation> getAll()
	{
		
		System.out.println("In getallevents");
		return eventinfoservice.getAll();
	}
}
*/