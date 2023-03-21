package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistReqdummy;
import com.example.demo.entities.ArtistRequest;
import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;
import com.example.demo.services.OrganizerRequestService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class OrganizerRequestController 
{
	@Autowired
	OrganizerRequestService ors;
	
	
	@GetMapping("/ApproveOrganizer")
	public int approveOrganizer (@RequestParam("loginid") int id)
	{
		return ors.approveOrganizer(id);
	}
	


@GetMapping("/RejectOrganizer")
public int rejectOrganizer(@RequestParam("loginid") int loginid)
{
	
	
	System.out.println("rejectArtist "+ loginid);
	return ors.rejectOrganizer(loginid);
	
}


@GetMapping("/ViewApproveOrganizer")
public List<Organizer> viewApproveOrganizer()
{
			
	System.out.println("view approve artist");
	
	
	List<Organizer> or= ors.viewApproveOrganizer();		
	return or;
	
}

}





