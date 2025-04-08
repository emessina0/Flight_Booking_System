package lab1;

import coe528.lab1.Flight;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emili
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
    public void testConstructor() {
    System.out.println("Flight Constructor Test");
    Flight t = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
    
    assertEquals(1030, t.getFlightNumber());
    assertEquals("Toronto", t.getOrigin());
    assertEquals("Kolkata", t.getDestination());
    assertEquals("03/02/99 7:50 pm", t.getDepartureTime());
    assertEquals(500, t.getCapacity());
    assertEquals(1000, t.getOriginalPrice(),0);   
    }
    
    @Test(expected = Exception.class)
    public void testInvalidConstructor(){
    System.out.println("Invalid Constructor Test");
    Flight t1 = new Flight(1030, "Toronto", 
            "Toronto", "03/02/99 7:50 pm", 500, 1000);
    }
    
    
    
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber Test");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        int expResult = 1030;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result); }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin Test");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "Toronto";
        String result = instance.getOrigin();
        assertEquals(expResult, result);}

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination Test");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "Kolkata";
        String result = instance.getDestination();
        assertEquals(expResult, result);}
    
    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime Test");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "03/02/99 7:50 pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);}

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity Test");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        int expResult = 500;
        int result = instance.getCapacity();
        assertEquals(expResult, result);}

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft Test");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        int expResult = 5;
        instance.setNumberOfSeatsLeft(5);
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);}

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice Test");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        double expResult = 1000;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0);}

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber Test");
        int flightNumber = 1041;
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        instance.setFlightNumber(flightNumber);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin Test");
        String origin = "California";
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        instance.setOrigin(origin);}

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination Test");
        String destination = "Hawaii";
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        instance.setDestination(destination);}

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime Test");
        String departureTime = "03/02/99 8:50 pm";
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        instance.setDepartureTime(departureTime);}

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity Test");
        int capacity = 1000;
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        instance.setCapacity(capacity);}

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft Test");
        int numberOfSeatsLeft = 19;
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);}

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice Test");
        double originalPrice = 1918;
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        instance.setOriginalPrice(originalPrice);}

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        String expResult = "Flight1030, Toronto to Kolkata, 03/02/99 7:50 pm, original price: 1000.0";
        String result = instance.toString();
        assertEquals(expResult, result);}
    
}
