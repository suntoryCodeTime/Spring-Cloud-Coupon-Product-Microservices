package com.suntorycodetime.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suntorycodetime.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
