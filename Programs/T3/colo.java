import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Ticket {
    public String ticketId;
    public String passengerName;
    public double ticketPrice;
    Scanner sc = new Scanner(System.in);

    Ticket() {
        System.out.println("Enter your ticket id : ");
        this.ticketId = sc.next();
        System.out.println("Enter your name : ");
        sc.nextLine();
        this.passengerName = sc.nextLine();
        System.out.println("Enter ticket price : ");
        this.ticketPrice = sc.nextDouble();
    }

    abstract void displayTicketDetails();
}

class FlightTicket extends Ticket {
    Scanner sc = new Scanner(System.in);
    public String flightNumber;
    public String airlineName;
    public String departureAirport;
    public String destinationAirport;

    FlightTicket() {
        super();
        System.out.println("Enter your flight number: ");
        this.flightNumber = sc.next();
        System.out.println("Enter your airline name : ");
        this.airlineName = sc.next();
        System.out.println("Enter your departure airport : ");
        this.departureAirport = sc.next();
        System.out.println("Enter your destination airport : ");
        this.destinationAirport = sc.next();
    }

    void displayTicketDetails() {
        System.out.println("Flight Number : " + flightNumber);
        System.out.println("Airline name  : " + airlineName);
        System.out.println("departure airport : " + departureAirport);
        System.out.println("destination airport : " + destinationAirport);
        System.out.println("ticket id  : " + ticketId);
        System.out.println("passenger name  : " + passengerName);
        System.out.println("ticket price : " + ticketPrice);
    }
}

class TrainTicket extends Ticket {
    public String trainNumber;
    public String departureStation;
    public String destinationStation;
    public int seatNumber;
    Scanner sc = new Scanner(System.in);

    TrainTicket() {
        super();
        System.out.println("Enter your train number : ");
        this.trainNumber = sc.next();
        System.out.println("Enter your departure airport : ");
        this.departureStation = sc.next();
        System.out.println("Enter your destination airport : ");
        this.destinationStation = sc.next();
        System.out.println("Enter your seat number : ");
        this.seatNumber = sc.nextInt();
    }

    void displayTicketDetails() {
        System.out.println("Flight Number : " + trainNumber);
        System.out.println("Train seat number  : " + seatNumber);
        System.out.println("departure train Station : " + departureStation);
        System.out.println("destination train Station : " + destinationStation);
        System.out.println("ticket id  : " + ticketId);
        System.out.println("passenger name  : " + passengerName);
        System.out.println("ticket price : " + ticketPrice);
    }
}

interface TicketBooking {
    void bookTicket();

    void displayTicket();
}

class TicketNotFoundException extends Exception {
    TicketNotFoundException() {
        super("Ticket is not found");
    }
}

class MaximumTicketReachedException extends Exception {
    MaximumTicketReachedException() {
        super("maximum number of ticket has been reached.");
    }
}

class TicketBookingImpl implements TicketBooking {
    public Ticket[] tickets;
    public int ticketCount;
    Scanner sc = new Scanner(System.in);

    TicketBookingImpl() {
        tickets = new Ticket[2];
        ticketCount = 0;
        ticketCount++;
    }

    public void bookTicket() {
        System.out.println("Enter the ticket type \n1.Flight\n2.Train\nEnter your choice : ");
        int n = sc.nextInt();
        if (ticketCount >= tickets.length) {
            try {
                throw new MaximumTicketReachedException();
            } catch (MaximumTicketReachedException e) {
                e.printStackTrace();
            }
        }

        switch (n) {
            case 1:
                FlightTicket f = new FlightTicket();
                tickets[ticketCount - 1] = f; // Store the created FlightTicket object in the array
                // f.displayTicketDetails();
                break;
            case 2:
                TrainTicket t = new TrainTicket();
                tickets[ticketCount - 1] = t; // Store the created TrainTicket object in the array
                // t.displayTicketDetails();
                break;
            default:
                System.out.println("Enter valid choice !");
                try {
                    throw new InputMismatchException();
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
        }
        ticketCount++;
    }

    public void displayTicket() {
        System.out.println("Enter your ticket id for track your tickets : ");
        String ticket_id = sc.next();
        for (int i = 0; i < ticketCount; i++) {
            if (tickets[i].ticketId.equals(ticket_id)) {
                tickets[i].displayTicketDetails();
                return;
            }
        }
        try {
            throw new TicketNotFoundException();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

class colo {
    public static void main(String[] args) {
        TicketBookingImpl ticketBooking = new TicketBookingImpl();
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("1. Book ticket");
            System.out.println("2. Display Ticket ");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        ticketBooking.bookTicket();
                        break;
                    case 2:
                        ticketBooking.displayTicket();
                        break;
                    case 3:
                        System.out.println("Thank you for using the system!");
                        return;
                    default:
                        System.out.println("Enter valid choice .");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close();
        ticketBooking.displayTicket();
    }
}