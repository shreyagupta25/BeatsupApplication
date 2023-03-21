package com.example.demo.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;
import com.example.demo.entities.UpdateOrganizer;
import com.example.demo.repositories.AreaRepository;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.OrganizerRepository;


@Service
public class OrganizerService {

	@Autowired
	OrganizerRepository orepo;
	
	@Autowired
	LoginRepository lrepo;
	
	@Autowired
	AreaRepository arearepo;
	
	
	public Organizer getById(Login l)
	{

		
		return orepo.getOrganizer(l);
	}
	
public Organizer getById(int id)
	{

		
		return orepo.findById(id).get();
	}
	
	
	public Organizer saveOrganizer(Organizer o)
	{
		return orepo.save(o);
	}

	public Organizer getOrganizer(int artid) {
		
		
		return orepo.findById(artid).get();
	}
	
	public List<Organizer>getAllOrganizer()
	{
		return orepo.findAll();
	}
	
	
public Map<Integer, Object> editUser(int loginid, UpdateOrganizer lr) {
		
		
	
	Login l= lrepo.findById(loginid).get();
	System.out.println(l);
	l.setEmail(lr.getLoginid().getEmail());
	//l.setPassword(lr.getPassword());
	
	l=lrepo.save(l);
	Organizer org=orepo.getOrganizer(l);
	
	//org.setAreaid(arearepo.findById(lr.getAreaid()).get());
	
	
	org.setName(lr.getName());
	org.setContact(lr.getContact());
	
	org=orepo.save(org);
	return Collections.singletonMap(loginid, 1);
}

	
}
