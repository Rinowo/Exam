package exercise2;

import java.util.Scanner;

public class Flight {
    int number;
    String destination;

    public Flight() {
    }

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Destination: "); String destination = sc.nextLine();
        System.out.print("Enter Number: "); int number = sc.nextInt();
        Flight flight = new Flight(number, destination);
        flight(new Flight(number, destination));
        if (number == 0 || destination == null) {
            System.err.println("Error! Number should be positive number and desination not null");
        } else {
            this.number = number;
            this.destination = destination;
            display();
        }
    }

    private void flight(Flight flight) {
    }

    public void display() {
        System.out.println(number + ", " + destination);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

}
