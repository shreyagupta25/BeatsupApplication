package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Skill;
import com.example.demo.entities.State;
import com.example.demo.services.SkillService;
import com.example.demo.services.StateService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class SkillController
{
	
	@Autowired
	SkillService skservice;
	
	@GetMapping("/getAllSkill")
	public List<Skill> getAll()
	{
		System.out.println("in skill");
		return skservice.getAll();
	}

}
