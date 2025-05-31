package com.springboot.bookingmanagement.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bookingmanagement.model.Movie;
import com.springboot.bookingmanagement.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
	
	public List<Show> findBytheMovie(Movie m);
}
