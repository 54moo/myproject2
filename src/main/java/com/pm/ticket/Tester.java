package com.pm.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructor, constant value
        List<Ticket> ticket = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (exit != true) {
            System.out.println("Your start station? 1): Taipei, 2): Taichung, 3): Kaohsiung)");
            int choice = Integer.parseInt(scanner.next());
            Station start = null;
            switch (choice) {
                case 1:
                    start = Station.TAIPEI_CITY;
                    break;
                case 2:
                    start = Station.TAICHUNG_CITY;
                    break;
                case 3:
                    start = Station.KAOHSIUNG_CITY;
                    break;
            }
            System.out.println("Your destination station? 1): Taipei, 2): Taichung, 3): Kaohsiung)");
            choice = Integer.parseInt(scanner.next());
            Station destination = null;
            switch (choice) {
                case 1:
                    destination = Station.TAIPEI_CITY;
                    break;
                case 2:
                    destination = Station.TAICHUNG_CITY;
                    break;
                case 3:
                    destination = Station.KAOHSIUNG_CITY;
                    break;
            }
            //what type of ticket?
            //how many tickets?

            System.out.println("Which kind of ticket? 1)Normal , 2)Student , 3)Senior, 4)Return ");
            choice = Integer.parseInt(scanner.next());
            System.out.println("How many tickets?");
            int num = Integer.parseInt(scanner.next());
            String type = null;
            switch(choice) {
                case 1:
                    type = "NormalTicket";
                    Ticket normalTicket = new Ticket(start, destination, type, num);
                    ticket.add(normalTicket);
                    break;
                case 2:
                    type = "StudentTicket";
                    Ticket studentTicket = new StudentTicket(start, destination, type, num);
                    ticket.add(studentTicket);
                    break;
                case 3:
                    type = "SeniorTicket";
                    Ticket seniorTicket = new SeniorTicket(start, destination, type, num);
                    ticket.add(seniorTicket);
                    break;
                case 4:
                    type = "ReturnTicket";
                    Ticket returnTicket = new ReturnTicket(start, destination, type, num);
                    ticket.add(returnTicket);
                    break;
            }

            System.out.println("Continue?" + "\n" + "1.Yes" + "\t" + "2.No");
            int options = Integer.parseInt(scanner.next());
            if (options == 1) {
                exit = false;
            } else if (options == 2) {
                exit = true;
            }
        }
        for (Ticket t : ticket) {
            t.print();
        }
        System.out.println("Thank you for buying.");
        }
    }