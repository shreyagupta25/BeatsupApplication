package com.example.demo.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.example.demo.entities.EventInformation;
import com.example.demo.entities.EventSkill;
import com.example.demo.entities.Organizer;
import com.example.demo.entities.OrganizerReg;
import com.example.demo.entities.PostEvents;
import com.example.demo.entities.Skill;
import com.example.demo.entities.State;
import com.example.demo.services.AreaService;
import com.example.demo.services.EventInformationService;
import com.example.demo.services.EventSkillService;
import com.example.demo.services.OrganizerService;
import com.example.demo.services.SkillService;
import com.example.demo.services.StateService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class EventController 
{
	@Autowired
	EventSkillService eventskillservice;
	
	@Autowired
	EventInformationService eveservice;

	@Autowired
	OrganizerService oservice;

	@Autowired
	AreaService aservice;
	
	@Autowired
	SkillService skservice;


	
	@GetMapping("/getAllEvents")
	public List<EventSkill> getAll()
	{
		
		System.out.println("In getallevents");
		
		return eventskillservice.getAll();
	}


	@PostMapping("/PostEvents")
	public EventInformation postEvents(@RequestBody PostEvents lr) throws Exception
	{
		
		System.out.println(lr);
		System.out.println("In getallevents");
		System.out.println(lr.getDate());
		String s = lr.getDate();
		s = s.replace('T', ' ');
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date d = sdf.parse(s);
		Organizer o= oservice.getById(lr.getOno());
		
		Area area =aservice.getArea(lr.getAreaid());
		
		EventInformation e= new EventInformation(o,lr.getEname(),d,lr.getArea(),area);
		
		EventInformation esaved=eveservice.saveEvent(e);
		
		Skill sk = skservice.getSkill(lr.getSkillid());
		
		EventSkill evs=new EventSkill(esaved,sk,lr.getCharges());
		
		eventskillservice.saveEventSkill(evs);
		
		return esaved;
	}
}