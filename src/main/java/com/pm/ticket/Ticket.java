package com.pm.ticket;
//NormalTicket

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    String types;
    int price;
    int number;

    public Ticket(Station start, Station destination, String types, int number) {
        this.start = start;
        this.destination = destination;
        this.types = types;
        this.number = number;

        if (start == Station.TAIPEI_CITY && destination == Station.TAICHUNG_CITY) {
            price = 600;
        } else if (start == Station.TAICHUNG_CITY && destination == Station.KAOHSIUNG_CITY) {
            price = 900;
        } else if (start == Station.TAIPEI_CITY && destination == Station.KAOHSIUNG_CITY)
            price = 1500;
        }

        public void print() {
            System.out.println("from " + start.name + " to " + destination.name +
                    "\t" + "(" + types + ")" + "\t" + "*" + number + "\t" + "price:" + price * number);
        }
    }
