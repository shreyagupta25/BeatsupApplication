package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.State;
import com.example.demo.services.AreaService;
import com.example.demo.services.CityService;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class AreaController {
	@Autowired
	AreaService aservice;
	
	@Autowired
	CityService cservice;
	
	/*@GetMapping("/getAllAreas")
	public List<Area> getAll()
	{
		return aservice.getAll();
	}
*/	
	

	@GetMapping("/getAllAreas")
	public List<Area> getAll(@RequestParam("cityid") int cityid)
	{
		//System.out.println();
		City c= cservice.getById(cityid);
		return aservice.getByCity(c);
	}


}
