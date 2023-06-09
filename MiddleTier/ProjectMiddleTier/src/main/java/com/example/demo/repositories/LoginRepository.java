package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;

@Repository
@Transactional

public interface LoginRepository extends JpaRepository<Login, Integer> 
{

	@Query("select l from Login l where email = :uid and password =:pwd")
	public Optional<Login> getLogin(String uid,String pwd);



/*
	@Query("select c from Contact c where fnanme like '%a%'")
	public List<Contact> getAllWithA();
	
	//@Query(value="if sql query written",nativeQuery = true)
	//@Query("select c from Contact c where email = :mail and contactno = :cno")
	//public List<Contact> getContacts(String mail, String cno);
	
	//executeQuery()
	@Query("select c from Contact c where email = ?1 or contactno = ?2")
	public List<Contact> getContacts(String mail, String cno);
	
	//executeUpdate()
	@Modifying
	@Query("update Contact c set c.email = :mail where c.cid = :id")
	public int updateEmail(int id, String mail);
	
	/*
	@Procedure(name = "" ,outputParameterName = "")
	public List<Contact> getC();
	*/
	

}