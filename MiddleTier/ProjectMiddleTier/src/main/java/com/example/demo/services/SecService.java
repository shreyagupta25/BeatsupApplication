package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Role;
import com.example.demo.entities.SecQuestion;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.SecRepository;


@Service
public class SecService {

	@Autowired
	SecRepository secepo;
	
	public List<SecQuestion> getAll() {
		return secepo.findAll();
	}
	
	public SecQuestion getSecQue(int id) {
		return secepo.findById(id).get();
	}
}
