package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Audience;
import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;

@Repository
@Transactional

public interface AudienceRepository extends JpaRepository<Audience, Integer> 
{

	@Query("select l from Audience l where loginid = :l")
	public Audience getAudience(Login l);
	

	@Query("select l from Audience l where loginid = :l")
	public Optional<Audience> findByLoginId(int l);


}