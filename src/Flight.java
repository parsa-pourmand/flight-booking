/**
 *
 * @author parsapourmand
 */
public class Flight {
    //Instance variables of class Flight
   private int flight_Number, capacity, number_of_seats_left;
   private double original_price;
   private String origin, destination, departure_Time;
    
    public Flight(int flight_num, int capacity, double original_price, String origin, String destination, String departure_time){
            
        if(origin.equals(destination)) {
            throw new IllegalArgumentException("The origin and destination can not be same places!");
        }
            
        this.flight_Number = flight_num;
        this.capacity = capacity;
        this.number_of_seats_left = capacity;
        this.original_price = original_price;
        this. origin = origin;
        this.destination = destination;
        this.departure_Time = departure_time;
    }
    
    public void setFlightNumber(int flight_Num){
        this.flight_Number = flight_Num;
    }
    
    public int getFlightNumber(){
        return this.flight_Number;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public void setSeatsLeft(int seats_Left){
        this.number_of_seats_left = seats_Left;
    }
    
    public int getSeatsLeft(){
        return this.number_of_seats_left;
    }
    
    public void setOrig_Price(double price){
        this.original_price = price;
    }
    
    public double getOrig_Price(){
        return this.original_price;
    }
    
    public void setOrigin(String origin){
        this.origin = origin;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public void setDeparture_Time(String departure_Time){
        this.departure_Time = departure_Time;
    }
    
    public String getDeparture_Time(){
        return this.departure_Time;
    }
    //bookASeat function, which returns true if the number of seats is greater than zero.
    public boolean bookASeat(){
        if(this.number_of_seats_left > 0){
            this.number_of_seats_left--;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Flight " + flight_Number + ", " + origin + " to " + destination + ", " + departure_Time + ", original price: " + original_price + "$";
    }
}
