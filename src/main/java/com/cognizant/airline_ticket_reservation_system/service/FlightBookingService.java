package com.cognizant.airline_ticket_reservation_system.service;

import com.cognizant.airline_ticket_reservation_system.dao.FlightBookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingService {
    private FlightBookingDao flightBookingDao;

    @Autowired
    public void setFlightBookingDao(FlightBookingDao flightBookingDao) {
        this.flightBookingDao = flightBookingDao;
    }
}
