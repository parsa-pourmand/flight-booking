
/**
 *
 * @author parsapourmand
 */
import java.util.ArrayList;
import java.util.Scanner;
        
public class Manager {
    private int index=-1;
    //Two array list, one for tickets and another one for flights
    ArrayList<Flight> flights = new ArrayList<Flight>();
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    Scanner scan = new Scanner(System.in);
    //This function takes information from the user and creats objects of class Flight and save in the flights arrayList. 
    public void createFlights(){
        System.out.println("How many flights do you want to enter?");
        int number_of_flights = scan.nextInt();
        System.out.println("Please write the information about the flights in the following order:");
        
        for(int i =0; i<number_of_flights; i++){
            
            System.out.println("1-Flight Number: ");
            int flight_num = scan.nextInt();
            System.out.println("2-Flight capacity: ");
            int flight_cap = scan.nextInt();
            System.out.println("3-flight price: ");
            double flight_price = scan.nextDouble();
            scan.nextLine();
            System.out.println("4-Origin: ");
            String origin = scan.nextLine();
            System.out.println("5-Destination: ");
            String destin = scan.nextLine();
            System.out.println("6-Departure Time: ");
            String departure = scan.nextLine();
            flights.add(new Flight(flight_num, flight_cap, flight_price, origin, destin, departure));
            
            System.out.println("Flight " + (i+1) + " added!");
        }
    }
    //This function prints the availble flights based on the given origin and destination (It searches in the flights arrayList).
    public void displayAvailableFlights(String origin, String destination){
        boolean condition = false;
        for(int i=0; i<flights.size(); i++){
            if(flights.get(i).getOrigin().equals(origin) && flights.get(i).getDestination().equals(destination) && flights.get(i).getSeatsLeft()>0){
                System.out.println(flights.get(i));
                condition = true;
            }
        }
        if(condition == false){
            System.out.println("There is no availble flight with this information.");
        }
    }
    //This function returns the flight object based on the given flight number.
    public Flight getFlight(int flightNumber){
        this.index = -1;
        for(int i=0; i<flights.size(); i++){
            if(flights.get(i).getFlightNumber() == flightNumber){
                this.index =i;
            }       
        } 
        if(index == -1){
            System.out.println("This flight number does not exist.");
            return null;
        }
        
        return flights.get(index);
    }
    //This function books a seat and creats a ticket object based on the given information
    public void bookSeat(int flightNumber, Passenger p){
        Flight flight_test = getFlight(flightNumber); 
        double final_price;
        if(flight_test != null){
            if (flight_test.bookASeat() == true ){
                final_price = p.applyDiscount(flight_test.getOrig_Price());
                tickets.add(new Ticket(p, flight_test, final_price));
                System.out.println("Booking was successful. ");
            
                int size = tickets.size();
                System.out.println(tickets.get(size-1));
            } else{
                System.out.println("Booking was not successful! The flight is full.");
            }
        }else{
            System.out.println("Booking was not successful!");
        }
    }
    
    public static void main(String[] args){
        int choice;
        boolean state = false;
        Manager manager = new Manager();
        
        System.out.println("Welcome to this flight booking system.");
        System.out.println("The first step in order to use this booking system is to creat some flights.");
        manager.createFlights();
        //We will be inside the loop until the user selects 4 and the state changes to true.
        while(state == false){
            System.out.println("");
            System.out.println("You can choose one of the following options: (Please type the number corresponding to each choice!)");
            System.out.println("1- Display availble flights");
            System.out.println("2- Getting flight information based on the flight number");
            System.out.println("3- Book a seat");
            System.out.println("4- Exit!");

            choice = manager.scan.nextInt();
            manager.scan.nextLine();
            
            switch(choice){
                case 1: System.out.println("Please enter the:");
                        System.out.println("1- Origin: ");
                        String origin = manager.scan.nextLine();
                        System.out.println("2- Destination: ");
                        String destination = manager.scan.nextLine();
                        manager.displayAvailableFlights(origin, destination);
                        break;
                        
                case 2: System.out.println("Please enter the flight number:");
                        int flight = manager.scan.nextInt();
                        System.out.println(manager.getFlight(flight));
                        break;
                        
                case 3: System.out.println("Please enter your: ");
                        System.out.println("1-Name: ");
                        String name = manager.scan.nextLine();
                        System.out.println("2-Age: ");
                        int age = manager.scan.nextInt();
                        System.out.println("Please enter the flight number of the flight you wish to book: ");
                        int flight_num = manager.scan.nextInt();
                        manager.scan.nextLine();
                        System.out.println("Are you a member? ");
                        String answer = manager.scan.nextLine();

                        if(answer.toLowerCase().equals("yes")){

                            System.out.println("For how many years are you a member? ");
                            int years = manager.scan.nextInt();
                            Passenger p = new Member(age, name, years);
                            manager.bookSeat(flight_num, p);

                        }else if(answer.toLowerCase().equals("no")){

                            Passenger p = new NonMember(age, name);
                            manager.bookSeat(flight_num, p);
                        }
                        break;

                case 4: state = true;
                break; 
                default: System.out.println("It's not one of the above choices!");
            }
       
        }
        System.exit(0);
    }
}
