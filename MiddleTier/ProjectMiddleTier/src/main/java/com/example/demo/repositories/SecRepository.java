package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Login;
import com.example.demo.entities.SecQuestion;

public interface SecRepository extends JpaRepository<SecQuestion, Integer>{

	
	}


