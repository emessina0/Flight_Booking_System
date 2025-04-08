package coe528.lab1;
import java.util.ArrayList;

public class Manager {
  
ArrayList<Flight> flightArray;   
ArrayList<Ticket> ticketArray; 
    
public Manager() {
    this.flightArray = new ArrayList<>();
    this.ticketArray = new ArrayList<>();
    }
    
  public void createFlights(Flight flight){
      flightArray.add(flight);
  }  
  
  public void displayAvailableFlights(String origin, String destination){

    for (Flight flight : flightArray) {
    
  if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)
                && flight.getNumberOfSeatsLeft() > 0) {
  System.out.println("Flight "+flight.getFlightNumber() + " from " + origin + " to " + destination + " is available.");
  System.out.println("Number of seats left: " + flight.getNumberOfSeatsLeft());}
 
     
  }}
  
  
  public Flight getFlight(int flightNumber){
  
      
      for (Flight flight : flightArray){
 
     if(flight.getFlightNumber() == flightNumber){
         
         System.out.println("\nFor " +flight);
         
         return flight;
         
     }
    
      }
      return null;
  }
   
  public void bookSeat(int flightNumber, Passenger p){
    
      
     
      Flight f = getFlight(flightNumber);
  

        if(f != null && f.getNumberOfSeatsLeft() > 0){
        
        double discount = p.applyDiscount(f.getOriginalPrice());
        Ticket t = new Ticket(p, f, discount);
        ticketArray.add(t);
        System.out.println("Booking successful for "+ p.getName() + ". Ticket issued with price: $" + discount);}
        else {
        System.out.println("\nFlight not found or no seats available.");}}
      

  public static void main(String[] args ){
      
      Manager m = new Manager();
      
      
      /*Passangers*/
      
      Passenger p1 = new NonMember("Stephen", 20); //NonMember Regular
      Passenger p2 = new NonMember("Anton", 73); //NonMember Discount
      Passenger p3 = new Member(6, "Emilio", 20); //Member longtime member 
      Passenger p4 = new Member(3, "Christian", 23);
      
      
      
      /*Flights*/
      
      Flight f1 = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/2024 7:50 pm", 500, 1000);
      
      Flight f2 = new Flight(1031, "Toronto", 
           "Hawaii", "08/06/2024 6:00 am", 1000, 1200);
      
      Flight f3 = new Flight(1032, "Toronto", 
           "Japan", "04/11/2024 12 pm", 300, 600); //not available
      
      Flight f4 = new Flight(1033, "Toronto", 
           "United States", "06/12/2024 3 pm", 650, 800);
      
      m.createFlights(f1);
      m.createFlights(f2);
      m.createFlights(f3);
      m.createFlights(f4);
      
      /*Seats Left*/
      f1.setNumberOfSeatsLeft(5);
      f2.setNumberOfSeatsLeft(20);
      f3.setNumberOfSeatsLeft(0);
      f4.setNumberOfSeatsLeft(10);
      
      /*Display Available Flights*/
      System.out.println("\nList of Available Flights: ");
      m.displayAvailableFlights(f1.getOrigin(), f1.getDestination());
      m.displayAvailableFlights(f2.getOrigin(), f2.getDestination());
      m.displayAvailableFlights(f3.getOrigin(), f3.getDestination());
      m.displayAvailableFlights(f4.getOrigin(), f4.getDestination());
      
      /*Booking*/
      m.bookSeat(f1.getFlightNumber(), p1);
      m.bookSeat(f2.getFlightNumber(), p2);
      m.bookSeat(f3.getFlightNumber(), p3);
      m.bookSeat(f4.getFlightNumber(), p4);
     
      
      
      
      
      
      
  }  
}
