package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;
import com.example.demo.entities.Area;
import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistRequest;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.ArtistRepository;
import com.example.demo.repositories.ArtistRequestRepository;


@Service
public class ArtistRequestService {

	@Autowired
	ArtistRequestRepository arreqrepo;
	/*
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
	}*/
	
	public ArtistRequest saveArtist(ArtistRequest ar)
	{
		return arreqrepo.save(ar);
	}
	/*
	public int updateEmail(int id, String mail)
	{
		return crepo.updateEmail(id, mail);
	}*/
	
	public int approveArtist(int reqid) {
		
		return arreqrepo.approveArtist(reqid);
		//return arreqrepo.findAll();
	}

	public List<ArtistRequest> viewApproveArtist() {
		
		return arreqrepo.viewApproveArtist();
		//return arreqrepo.findAll();
	}

	

	public List<ArtistRequest> viewCancelArtist(int artid) {
		// TODO Auto-generated method stub
		return arreqrepo.viewRejectArtist(artid);
	}
	
	
	public int cancelArtist(int reqid) {
		// TODO Auto-generated method stub
		return arreqrepo.cancelArtist(reqid);
	}

	public List<ArtistRequest> viewRejectArtist(int artid) {
		// TODO Auto-generated method stub
		return arreqrepo.viewCancelArtist(artid);
	}
	
	public int rejectArtist(int reqid) {
		// TODO Auto-generated method stub
		return arreqrepo.rejectArtist(reqid);
	}

	public List<ArtistRequest> viewCancelArtist(Artist artist) {
		
		return arreqrepo.viewCancelArtist(artist);
	}

	public List<ArtistRequest> getEventsForConcerts(Organizer organizer) {
		
		
		return arreqrepo.getEventsForConcerts(organizer);
	}

	
}
