package com.pm.ticket2;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;

    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        //System.out.println(diff);
        switch (diff) {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }

        if (start == Station.TAIPEI_CITY) {
            if (destination == Station.TAICHUNG_CITY) {
                price = 600;
            } else if (start == Station.TAICHUNG_CITY) {
                if (destination == Station.KAOHSIUNG_CITY) {
                    price = 900;
                } else if (start == Station.TAIPEI_CITY) {
                    if (destination == Station.KAOHSIUNG_CITY) {
                        price = 1500;
                    }
                }
            }
        }
    }
}

