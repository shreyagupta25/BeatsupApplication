package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.Concert;
@Repository
public interface ConcertRepository extends JpaRepository<Concert, Integer> {

	
	@Query("select l.soldtickets from Concert l where concertid = :conid ")
	int getTickets(int conid);

	@Modifying
	@Transactional
	@Query("update  Concert  set soldtickets = :newsold  where concertid = :conid ")
	int SoldTickets(int newsold, int conid);

	
}
