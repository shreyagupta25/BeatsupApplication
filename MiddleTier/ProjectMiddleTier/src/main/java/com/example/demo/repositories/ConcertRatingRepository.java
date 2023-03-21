package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Area;
import com.example.demo.entities.ArtistRating;
import com.example.demo.entities.City;
import com.example.demo.entities.ConcertRating;
@Repository
public interface ConcertRatingRepository extends JpaRepository<ConcertRating, Integer> {


	
}
