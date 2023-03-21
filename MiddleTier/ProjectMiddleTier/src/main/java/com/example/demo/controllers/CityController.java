package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.City;
import com.example.demo.entities.State;
import com.example.demo.services.CityService;
import com.example.demo.services.StateService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class CityController {
	@Autowired
	CityService cservice;
	
	@Autowired
	StateService sservice;
	
	@GetMapping("/getAllCities")
	public List<City> getAll(@RequestParam("stateid") int stateid)
	{
		//System.out.println();
		State s= sservice.getById(stateid);
		return cservice.getByState(s);
	}

}
