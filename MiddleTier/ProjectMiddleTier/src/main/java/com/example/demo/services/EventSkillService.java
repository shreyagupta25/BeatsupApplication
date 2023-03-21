package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.EventInformation;
import com.example.demo.entities.EventSkill;
import com.example.demo.repositories.EventInformationRepository;
import com.example.demo.repositories.EventSkillRepository;

@Service
public class EventSkillService
{
	@Autowired
	EventSkillRepository eventskillrepo;
	
	public List<EventSkill> getAll()
	{
		System.out.println("in re"+eventskillrepo.findAll());
		return eventskillrepo.findAll();
	}
	
	public EventSkill saveEventSkill(EventSkill e)
	{
		return eventskillrepo.save(e);
}
	
}
