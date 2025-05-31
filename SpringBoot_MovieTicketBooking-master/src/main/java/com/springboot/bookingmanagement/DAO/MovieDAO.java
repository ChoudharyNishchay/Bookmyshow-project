package com.springboot.bookingmanagement.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bookingmanagement.model.Movie;
import com.springboot.bookingmanagement.respository.MovieRepository;

@Service
public class MovieDAO {

	
	@Autowired
	MovieRepository theMoviewRepository;
	
//	Save the Movie
	public Movie save(Movie m) {
		return theMoviewRepository.save(m);
	}
	
//	FetchallMovie
	public List<Movie> getMovie(){
		return theMoviewRepository.findAll();
	}
	
//	Fetch movie by ID
	public Movie findOne(long ID){
		return theMoviewRepository.getOne(ID);
	}
	
//	Delete Movie
	public void deleteMovie(Movie m) {
		theMoviewRepository.delete(m);
	}
	
//	get Movie list by theater ID
	public List<Object[]> getMovieByTheaterId(long ID){
		return theMoviewRepository.getMovieByTheateID(ID);
	}
	
}
