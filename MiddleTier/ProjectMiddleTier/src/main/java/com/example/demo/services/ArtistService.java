package com.example.demo.services;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.UpdateArtist;
import com.example.demo.entities.Area;
import com.example.demo.entities.Artist;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.AreaRepository;
import com.example.demo.repositories.ArtistRepository;


@Service
public class ArtistService {

	@Autowired
	ArtistRepository arrepo;
	
	@Autowired
	LoginRepository lrepo;
	
	
	@Autowired
	AreaRepository arearepo;
	
	public Artist getById(Login l)
	{

		
		return arrepo.getArtist(l);
	}
	
	public Artist saveArtist(Artist ar)
	{
		return arrepo.save(ar);
	}
	
	public Artist getArtist(int id) {
		return arrepo.findById(id).get();
	}
	
	public boolean upload(int id, byte [] photo)
	{
		if(arrepo.uploadPhoto(id, photo) == 1)
			return true;
		else
			return false;
	}

	public Map<Integer, Object> editUser(int loginid, UpdateArtist lr) {
		
		
		Login l= lrepo.findById(loginid).get();
		System.out.println(l);
		l.setEmail(lr.getLoginid().getEmail());
		//l.setPassword(lr.getPassword());
		
		l=lrepo.save(l);
		
		
		Artist artist=arrepo.getArtist(l);
		
		//artist.setAreaid(arearepo.findById(lr.getAreaid()).get());
		
		artist.setFname(lr.getFname());
		artist.setLname(lr.getLname());
		artist.setContact(lr.getContact());
		
		artist=arrepo.save(artist);
		return Collections.singletonMap(loginid, 1);
	}
	public List <Artist> getAllArtist()
	{
		return arrepo.findAll();
	}

	
}
