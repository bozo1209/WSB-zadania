package com.bozo;

import java.sql.Connection;
import java.util.Locale;

import static com.bozo.Configuration.createSchema;
import static com.bozo.Configuration.getConnection;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = getConnection(); AirportManager airportManager = new AirportManager(connection)) {

//            createSchema(connection);

            // List airports
            System.out.printf("Check (1): %s%n", airportManager.getAirports());

            // Delete airports
//            airportManager.deleteAirports();

            // List airports
            System.out.printf("Check (2): %s%n", airportManager.getAirports());

            // Add airports
//            airportManager.addAirport(new Airport("WR2", "Wroclaw", 1.1, 11.11));
//            airportManager.addAirport(new Airport("DU2", "Dublin", 2.2, 22.22));
//            airportManager.addAirport(new Airport("PR2", "Prague", 3.3, 33.33));
//            airportManager.addAirport2(new Airport("WR3", "Wroclaw", 1.1, 11.11));
//            airportManager.addAirport2(new Airport("DU3", "Dublin", 2.2, 22.22));
//            airportManager.addAirport2(new Airport("PR3", "Prague", 3.3, 33.33));

            // List airports
            System.out.printf("Check (3): %s%n", airportManager.getAirports());

            // Get airport by code
            System.out.printf("Check (4): %s%n", airportManager.getAirport("WRO"));
            System.out.printf("Check (5): %s%n", airportManager.getAirport("BCN"));// Get airport by code
            System.out.printf("Check (4b): %s%n", airportManager.getAirport2("WRO"));
            System.out.printf("Check (5b): %s%n", airportManager.getAirport2("BCN"));

            // Update airport
            airportManager.updateAirport(new Airport("WRO", "Wroclaw Miasto Spotkan", 1.1, 11.11));

            // List airports
            System.out.printf("Check (6): %s%n", airportManager.getAirports());
        } catch(Exception e) {
            System.out.printf("Failed: %s%n", e.getMessage());
        }
    }
}