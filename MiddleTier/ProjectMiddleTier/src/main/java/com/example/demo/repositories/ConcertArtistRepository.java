package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.ConcertArtist;
@Repository
public interface ConcertArtistRepository extends JpaRepository<ConcertArtist, Integer> {

	@Query(value="select distinct ei.eventname,ei.eventtime,ei.eventloc,ei.eventaddress,ei.eventid,c.concertid,o.name,a.fname,a.lname,ar.audid,a.artid\r\n"
			+ "from audience  ar,concert_booking cb,concert c,event_information ei, organizer o,artist a,concert_artist ca \r\n"
			+ "where ar.audid=cb.audid and cb.concertid=c.concertid and c.eventid=ei.eventid and o.orgid=ei.orgid and ca.concertid=c.concertid and ca.artid=a.artid and ei.eventtime<now();\r\n"
			+ "",nativeQuery=true)
	List<Object[]> viewConcertsForRatings();

	@Query(value="\r\n"
			+ "select ei.eventid,ei.eventname,ei.eventtime,ei.eventaddress,c.totaltickets,c.concertid,c.soldTickets,c.price,a.fname,a.lname\r\n"
			+ "from event_information ei , concert c,concert_artist ca,artist a\r\n"
			+ "where ei.orgid=:orgid and ei.eventid = c.eventid and c.concertid=ca.concertid and a.artid=ca.artid;" ,nativeQuery=true)
	List<Object []> trackConcert(int orgid);

	

	
}
