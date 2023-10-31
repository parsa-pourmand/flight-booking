/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author parsapourmand
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testInvalidConstructor() {
        boolean gotEx = false;
        try {
            Flight f = new Flight(123,100,250,"Toronto", "Toronto", "7:50");
        }
        catch(IllegalArgumentException e) {
            gotEx = true;
        }
        assertTrue(gotEx);
    }
    
    @Test
    public void testConstructor(){
        Flight f = new Flight(123, 100, 250, "Toronto", "Vancouver", "6:30");
        int exp_flight_num = 123;
        int flight_num = f.getFlightNumber();
        assertEquals(exp_flight_num, flight_num);
        
        int exp_cap = 100;
        int cap = f.getCapacity();
        assertEquals(exp_cap,cap);
        
        double exp_p = 250;
        double price = f.getOrig_Price();
        assertEquals(exp_p,price, 0.0);
        
        String exp_origin = "Toronto";
        String orig = f.getOrigin();
        assertEquals(exp_origin, orig);
        
        String exp_des = "Vancouver";
        String des = f.getDestination();
        assertEquals(exp_des,des);
        
        String exp_dep = "6:30";
        String dep = f.getDeparture_Time();
        assertEquals(exp_dep, dep);
       
    }
	
 

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flight_Num = 0;
        Flight instance = new Flight(123, 100, 250, "Toronto", "Montreal", "7:50");
        instance.setFlightNumber(flight_Num);
        int result = instance.getFlightNumber();
        assertEquals(flight_Num, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        int expResult = 0;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 200;
        Flight instance = new Flight(123, 100, 250, "Toronto", "Montreal", "7:50");
        instance.setCapacity(capacity);
        int result = instance.getCapacity();
        assertEquals(capacity, result );
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        int expResult = 100;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetSeatsLeft() {
        System.out.println("setSeatsLeft");
        int seats_Left = 0;
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        instance.setSeatsLeft(seats_Left);
        int result = instance.getSeatsLeft();
        assertEquals(seats_Left,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetSeatsLeft() {
        System.out.println("getSeatsLeft");
        Flight instance = new Flight(0, 0, 250, "Toronto", "Montreal", "7:50");
        int expResult = 0;
        int result = instance.getSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrig_Price method, of class Flight.
     */
    @Test
    public void testSetOrig_Price() {
        System.out.println("setOrig_Price");
        double price = 0.0;
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        instance.setOrig_Price(price);
        double result = instance.getOrig_Price();
        assertEquals(price,result, 0.0);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrig_Price method, of class Flight.
     */
    @Test
    public void testGetOrig_Price() {
        System.out.println("getOrig_Price");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        double expResult = 250;
        double result = instance.getOrig_Price();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Vancouver";
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        instance.setOrigin(origin);
        String result = instance.getOrigin();
        assertEquals(origin,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Vancouver";
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        instance.setDestination(destination);
        String result = instance.getDestination();
        assertEquals(destination, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        String expResult = "Montreal";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDeparture_Time method, of class Flight.
     */
    @Test
    public void testSetDeparture_Time() {
        System.out.println("setDeparture_Time");
        String departure_Time = "2:30";
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        instance.setDeparture_Time(departure_Time);
        String result = instance.getDeparture_Time();
        assertEquals(departure_Time, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDeparture_Time method, of class Flight.
     */
    @Test
    public void testGetDeparture_Time() {
        System.out.println("getDeparture_Time");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        String expResult = "7:50";
        String result = instance.getDeparture_Time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(0, 100, 250, "Toronto", "Montreal", "7:50");
        String expResult = "Flight 0, Toronto to Montreal, 7:50, original price: 250.0$";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
