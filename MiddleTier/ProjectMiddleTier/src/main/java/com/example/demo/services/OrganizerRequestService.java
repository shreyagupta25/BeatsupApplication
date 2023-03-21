package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ArtistRequest;
import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;
import com.example.demo.repositories.OrganizerRequestRepository;

@Service
public class OrganizerRequestService
{
	@Autowired
	OrganizerRequestRepository orr;
	

	public int approveOrganizer(int id)
	{
		return orr.approveOrganizer(id);
	}
	public int rejectOrganizer(int loginid) {
		// TODO Auto-generated method stub
		return orr.rejectOrganizer(loginid);
	}
	
public List<Organizer> viewApproveOrganizer() {
		
		return orr.viewApproveOrganizer();
		//return orr.findAll();
	}
}
