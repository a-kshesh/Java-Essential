package ashish.patadiya.airticket.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.passengers.StaffPassenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.SeatingClass;
import com.cc.airline.ticketing.Ticket;

public class SellTicketTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Test of the SeatingPlan default constructor complete setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Test of the SeatingPlan default constructor complete tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Starting test of the SeatingPlan default constructor");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test of the SeatingPlan default constructor complete");
	}

	
	@Test
	public void sellTicket1() {
	SeatingClass sClass = SeatingClass.ECONOMY;
	Passenger passenger = new Passenger(
	new PassengerName("Ashish", "H", "Patadiya"));
	Seat seat = new Seat();
	seat.setRow(3); seat.setLetter('D');
	double price = sClass.getPrice();
	Ticket ticket = new Ticket(passenger, seat, price);
	System.out.println("Ticket issued: " + ticket);
	Assert.assertEquals(ticket.getPrice(), 500.0, 0.005 );
	}
	
	@Test
	public void sellTicket2() {
	SeatingClass sClass = SeatingClass.ECONOMY;
	PassengerName pName = new PassengerName("Aashish", "H", "Patadiya");
	StaffPassenger passenger = new StaffPassenger(pName, "EMP003");
	Seat seat = new Seat();
	seat.setRow(3); seat.setLetter('D');
	double price = sClass.getPrice();
	Ticket ticket = new Ticket(passenger, seat, price);
	System.out.println("Ticket issued: " + ticket);
	Assert.assertEquals(ticket.getPrice(), 250.0, 0.005 );
	} 	
	
	@Test
	public void sellTicket3() {
	SeatingClass sClass = SeatingClass.BUSINESS;
	PassengerName pName = new PassengerName("Aashish", "H", "Patadiya");
	StaffPassenger passenger = new StaffPassenger(pName, "EMP003");
	Seat seat = new Seat();
	seat.setRow(3); seat.setLetter('D');
	double price = sClass.getPrice();
	Ticket ticket = new Ticket(passenger, seat, price);
	System.out.println("Ticket issued: " + ticket);
	Assert.assertEquals(ticket.getPrice(), 750.0, 0.005 );
	}
	

}
