package ashish.patadiya.airticket.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cc.airline.ticketing.SeatingPlan;


public class SeatingPlanTest {

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
	public void testSeatingPlan() {
		//fail("Not yet implemented");
		SeatingPlan sp = new SeatingPlan();
		Assert.assertNotNull(sp);
		int actualNumBusSeats = sp.getNumBusSeats();
		int actualNumTotalRows = sp.getTotalRows();
		int actualNumTotalSeats = sp.getTotalSeats();
		
		int expectedNumBusSeats = 2;
		int expectedNumToatlRow = 4;
		int expectedNumToatlSeats = 14;
		assertEquals(expectedNumBusSeats,actualNumBusSeats);
		assertEquals(expectedNumToatlRow, actualNumTotalRows);
		assertEquals(expectedNumToatlSeats, actualNumTotalSeats);
		//Assert.assertEquals(sp.getSeats().size(), 14);
		//Assert.assertNotNull(sp.getSeatReserver());
	}

}
