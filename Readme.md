Flight Booking System

The Flight Booking System is a simple Java application that simulates flight booking for passengers. It includes a set of classes to represent flights, passengers, tickets, and a manager to handle flight booking operations.

Classes:

1-Flight:

The Flight class represents a flight and has the following instance variables:

flightNumber (int): Unique flight number.

origin (String): Flight's origin.

destination (String): Flight's destination.

departureTime (String): Departure time of the flight.

capacity (int): Maximum capacity of the flight.

numberOfSeatsLeft (int): Number of available seats.

originalPrice (double): Original price of the flight.

The class provides a constructor to initialize these variables, getters and setters for instance variables, and a bookASeat() method to book a seat on the flight if available.

2-Passenger:

Passenger is an abstract class that represents common attributes for passengers:

name (String): Passenger's name.

age (int): Passenger's age.

3-Member:

Member is a subclass of Passenger. It includes an additional attribute:

yearsOfMembership (int): Number of years as a member.

This class overrides the applyDiscount(double p) method to provide discounts based on the years of membership.

4-NonMember:

NonMember is a subclass of Passenger. It doesn't have any additional attributes. It also overrides the applyDiscount(double p) method to provide discounts based on the passenger's age.

5-Ticket:

The Ticket class represents a flight ticket with the following attributes:

passenger (Passenger): The passenger who booked the ticket.

flight (Flight): The flight for which the ticket is booked.

price (double): The price of the ticket.

number (int): A unique ticket number.

6-Manager:

The Manager class manages flights and ticket bookings. It provides the following methods:

createFlights(): Populate the array of flights by taking user input.

displayAvailableFlights(origin, destination): Display available flights from origin to destination.

getFlight(flightNumber): Get the Flight object for a specified flight number.

bookSeat(flightNumber, passenger): Find and book a seat on the specified flight. Apply discounts based on passenger type (Member or NonMember) and issue a ticket.

Usage

The Manager class serves as the entry point for this application. The main() method demonstrates how to use the classes to create flights, display available flights, and book seats with tickets issued.

- To run the application:

Compile all the .java files.

Run the Manager class, which will allow you to interactively create flights and book tickets.

Enjoy booking flights!

- Testing

Unit tests for the Flight class are provided using JUnit 4. The tests cover the constructor, getters, setters, bookASeat(), and toString() method.
