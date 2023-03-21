package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.Audience;
import com.example.demo.entities.City;
import com.example.demo.entities.Concert;
import com.example.demo.entities.ConcertBooking;
@Repository
public interface ConcertBookingRepository extends JpaRepository<ConcertBooking, Integer> {

	@Query("select l from ConcertBooking  l where audid = :aid")
	List<ConcertBooking> bookedTickets(Audience aid);

	
}
