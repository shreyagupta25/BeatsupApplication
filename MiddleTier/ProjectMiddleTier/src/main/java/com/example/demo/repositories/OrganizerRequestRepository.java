package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ArtistRequest;
import com.example.demo.entities.Login;
import com.example.demo.entities.Organizer;
@Transactional
@Repository
public interface OrganizerRequestRepository extends JpaRepository<Login, Integer> {
	@Modifying
	@Query("update Login c set c.status = 1 where c.loginid = :id")
	public int approveOrganizer(int id);
	
	
	@Modifying
	@Query("update Login c set c.status = 2 where c.loginid = :loginid")
	public int rejectOrganizer(int loginid);
	
	@Query("SELECT  o FROM  Organizer o INNER JOIN Login l ON o.loginid=l.loginid WHERE   l.status=0")
	public List<Organizer> viewApproveOrganizer();
	
}
