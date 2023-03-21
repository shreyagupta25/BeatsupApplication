package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.entities.Skill;
@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

	//@Query("select a from Area a where cityid= :cityid")
	//public List<Area> getAll(City cityid);
	
}
