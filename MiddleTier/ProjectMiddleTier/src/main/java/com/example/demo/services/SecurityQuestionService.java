package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.City;
import com.example.demo.entities.SecurityQuestion;
import com.example.demo.repositories.CityRepository;
import com.example.demo.repositories.SecurityQuestionRepository;

@Service
public class SecurityQuestionService {
	@Autowired
	SecurityQuestionRepository sqrepo;
	public List<SecurityQuestion> getAll()
	{
		return sqrepo.findAll();
	}
}

