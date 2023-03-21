package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Artist;
import com.example.demo.entities.ArtistRequest;
import com.example.demo.entities.Organizer;

@Repository
@Transactional

public interface ArtistRequestRepository extends JpaRepository<ArtistRequest, Integer> 
{
	
	@Query("select c from ArtistRequest c where c.status=0")
	public List<ArtistRequest> viewApproveArtist();
	
	@Modifying
	@Query("update ArtistRequest c set c.status = 1 where c.reqid = :reqid")
	public int approveArtist(int reqid);
	

	@Query("select c from ArtistRequest c where c.status=0 and artid = :artid")
	public List<ArtistRequest> viewRejectArtist(int artid);
	
	@Modifying
	@Query("update ArtistRequest c set c.status = 2 where c.reqid = :reqid")
	public int rejectArtist(int reqid);
	
	
	@Query("select c from ArtistRequest c where c.status= 1  and artid = :artid")
	public List<ArtistRequest> viewCancelArtist(int artid);
	
	
	@Modifying
	@Query("update ArtistRequest c set c.status = 3 where c.reqid = :reqid")
	public int cancelArtist(int reqid);

	

	@Query("select c from ArtistRequest c where c.status= 1  and artid = :artist")
	public List<ArtistRequest> viewCancelArtist(Artist artist);

	@Query("SELECT  ar FROM  ArtistRequest ar INNER JOIN EventInformation ev ON ar.eventid=ev.eventid WHERE  ev.orgid = :organizer")
	public List<ArtistRequest> getEventsForConcerts(Organizer organizer);
	
	
	
	/*
	@Query("select l from artist_request")
	public ArtistRequest viewApproveArtist();


/*
	@Query("select l from Artist l where loginid = :l")
	public Artist getArtist(Login l);

	@Modifying
	@Query("update Artist set image =:file where artid = :id")
	public int uploadPhoto(int id, byte [] file);
	
*/
}