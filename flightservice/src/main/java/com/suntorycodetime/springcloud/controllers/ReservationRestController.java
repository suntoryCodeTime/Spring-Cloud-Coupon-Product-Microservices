package com.suntorycodetime.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suntorycodetime.springcloud.model.Flight;
import com.suntorycodetime.springcloud.repos.FlightRepository;

@RestController
@RequestMapping("/flightapi")
public class ReservationRestController {
	
	@Autowired
	private FlightRepository repo;
	
	/**
	 * Read Flights in Database given a flight_number
	 **/
	@RequestMapping(value="/flights", method=RequestMethod.GET)
	public List<Flight> findFlights(){
		return repo.findAll();
	}
}
