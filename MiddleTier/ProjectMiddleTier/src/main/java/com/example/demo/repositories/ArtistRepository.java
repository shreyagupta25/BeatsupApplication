package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Artist;
import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;

@Repository
@Transactional

public interface ArtistRepository extends JpaRepository<Artist, Integer> 
{

	@Query("select l from Artist l where loginid = :l")
	public Artist getArtist(Login l);

	@Modifying
	@Query("update Artist set image =:file where artid = :id")
	public int uploadPhoto(int id, byte [] file);

	@Query("select l from Artist l where loginid = :l")
	public Optional<Artist> findByLoginId(int l);
	

}