package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.ArtSkill;
import com.example.demo.entities.Artist;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.ArtSkillRepository;
import com.example.demo.repositories.ArtistRepository;


@Service
public class ArtSkillService {

	@Autowired
	ArtSkillRepository arsrepo;
	
	/*public Artist getById(Login l)
	{

		
		return arsrepo.getArtist(l);
	}*/
	
	public ArtSkill saveArtist(ArtSkill ar)
	{
		return arsrepo.save(ar);
	}
	
	
}
