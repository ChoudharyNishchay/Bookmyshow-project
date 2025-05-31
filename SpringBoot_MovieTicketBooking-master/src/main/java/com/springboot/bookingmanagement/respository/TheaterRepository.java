package com.springboot.bookingmanagement.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.bookingmanagement.model.City;
import com.springboot.bookingmanagement.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

	public List<Theater> findByCity(City ID);
}
