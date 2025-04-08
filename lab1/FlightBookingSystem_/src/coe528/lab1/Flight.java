/* Emilio Messina 501178927 */
package coe528.lab1;

public class Flight {
  
//instance variables are always declared private
    
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice; 

    public Flight(int flightNumber, String origin, String destination, 
            String departureTime, int capacity, double originalPrice){
       
       
        if(origin.equals(destination)){  
        throw new IllegalArgumentException("Origin can't be the same as the destination. ");}
            
        /*"==" compares the memory location of two objects, while 
                "equals" compares the contents of two objects */           
        
        
        this.flightNumber = flightNumber;
      
        this.origin = origin;
        
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }
    
    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }
    
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) { //**
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    

private boolean bookASeat(){
 
if(numberOfSeatsLeft > 0){
numberOfSeatsLeft--;
return true;}

else{
    return false;
}
}
@Override
   public String toString() { 
   return "Flight " + getFlightNumber() + ", " + getOrigin() + " to " + 
   getDestination() + ", " + getDepartureTime() + ", original price: " + getOriginalPrice();}}


/*
class main{
    public static void main(String args[]){
        Flight t = new Flight(1030, "Toronto", 
            "Kolkata", "03/02/99 7:50 pm", 500, 1000);
        
        System.out.print(t.toString());
        
        //Ticket t1 = new Ticket("Julia Chow", t.toString(), 600.00);
        
    }
}*/