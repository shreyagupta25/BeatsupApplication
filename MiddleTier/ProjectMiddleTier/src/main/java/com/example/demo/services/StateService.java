package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.StateRepository;
import com.example.demo.entities.State;
@Service
public class StateService 
{
	@Autowired
	StateRepository srepo;
	public List<State> getAll()
	{
		return srepo.findAll();
	}
	
	public State getById(int stateid)
	{
		return srepo.findById(stateid).get();
	}
	
	
}
