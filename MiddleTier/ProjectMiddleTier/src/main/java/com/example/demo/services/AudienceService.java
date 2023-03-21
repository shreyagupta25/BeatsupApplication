package com.example.demo.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.UpdateAudience;
import com.example.demo.entities.Audience;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.AreaRepository;
import com.example.demo.repositories.AudienceRepository;


@Service
public class AudienceService {

	@Autowired
	AudienceRepository aurepo;

	@Autowired
	LoginRepository lrepo;
	
	
	@Autowired
	AreaRepository arearepo;
	
	public Audience getById(Login l)
	{

		
		return aurepo.getAudience(l);
	}
	
	public Audience saveAudience(Audience o)
	{
		return aurepo.save(o);
	}

	public Audience getAudience(int id) {
		return aurepo.findById(id).get();
	}
	
		public Map<Integer, Object> editUser(int loginid, UpdateAudience lr) {
		
		
		Login l= lrepo.findById(loginid).get();
		System.out.println(l);
		l.setEmail(lr.getLoginid().getEmail());
		//l.setPassword(lr.getPassword());
		
		l=lrepo.save(l);
		
		
		Audience audience=aurepo.getAudience(l);
		
		//audience.setAreaid(arearepo.findById(lr.getAreaid()).get());
		
		audience.setFname(lr.getFname());
		audience.setLname(lr.getLname());
		audience.setContact(lr.getContact());
		
		audience=aurepo.save(audience);
		return Collections.singletonMap(loginid, 1);
	}

}
