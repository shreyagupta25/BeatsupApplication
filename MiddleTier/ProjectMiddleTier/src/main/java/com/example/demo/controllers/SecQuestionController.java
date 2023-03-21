package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.SecQuestion;
import com.example.demo.entities.State;
import com.example.demo.services.SecService;
import com.example.demo.services.StateService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class SecQuestionController
{
	@Autowired
	SecService secservice;
	
	@GetMapping("/getAlllQuestions")
	public List<SecQuestion> getAll()
	{
		return secservice.getAll();
	}

}
