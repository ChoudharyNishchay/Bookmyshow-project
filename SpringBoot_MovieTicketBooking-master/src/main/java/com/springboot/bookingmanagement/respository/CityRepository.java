package com.springboot.bookingmanagement.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bookingmanagement.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

}
