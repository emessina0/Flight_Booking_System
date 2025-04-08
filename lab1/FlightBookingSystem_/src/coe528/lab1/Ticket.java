package coe528.lab1;

public class Ticket {

private Passenger passenger;
private Flight flight;
private double price;
private int number;

    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;}

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    


@Override
   public String toString() { 
   return getPassenger() + ", " + getFlight() + ", ticket price: " + 
   getPrice();}}
