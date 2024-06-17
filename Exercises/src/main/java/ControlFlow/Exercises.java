package ControlFlow;

public class Exercises {
    public static void main(String[] args) {
        // 1
        int age = 19;
        int ticketPrice = 0;

        if (age < 5) {
            ticketPrice = 0;
        } else if (age <= 12) {
            ticketPrice = 5;
        } else if (age <= 12) {
            ticketPrice = 5;
        } else if (age <= 18) {
            ticketPrice = 10;
        } else {
            ticketPrice = 15;
        }

        System.out.println("Ticket price: $" + ticketPrice);
    }
}
