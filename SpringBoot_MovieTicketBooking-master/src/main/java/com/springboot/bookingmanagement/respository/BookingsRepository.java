package com.springboot.bookingmanagement.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.bookingmanagement.model.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Long> {

}
