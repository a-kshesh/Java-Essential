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
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.Ticket;

public class TicketTest {

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
	public void test() {
		//fail("Not yet implemented");
		Passenger passenger = new Passenger( new PassengerName("Ashish", "H", "Patadiya"));
		Seat s = new Seat();
		s.setRow(3);
		s.setLetter('j');
		Ticket ticket = new Ticket(passenger, s, 500);
		Assert.assertTrue(ticket.getTicketNo() > 1000000 );
		
	}
	
	@Test( expected=Exception.class)
	
	public void testTicketBad() {
	Ticket ticket = new Ticket(null, new Seat(), -100);
	Assert.assertTrue(ticket.getTicketNo() > 1000000 );
	}
	

}
