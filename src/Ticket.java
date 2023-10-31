
/**
 *
 * @author parsapourmand
 */
public class Ticket {
   private Passenger passenger;
   private Flight flight;
   private double price;
   private int number;
   private static int count =1;
   
   public Ticket(Passenger p, Flight flight, double price){
       this.passenger = p;
       this.flight = flight;
       this.price = price;
       this.number = count;
       count++;
   }
   
   public void setPassenger(Passenger p){
       this.passenger = p;
   }
   
   public Passenger getPassenger(){
       return this.passenger;
   }
   
   public void setFlight(Flight f){
       this.flight = f;
   }
   
   public Flight getFlight(){
       return this.flight;
   }
   
   public void setPrice(double p){
       this.price = p;
   }
   
   public double getPrice(){
       return this.price;
   }
   
   @Override
   public String toString(){
       return passenger.getName() + ", Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination() 
               + ", " + flight.getDeparture_Time() + ", original price: " + flight.getOrig_Price() + "$, ticket price: $" + this.price;
   }
}
