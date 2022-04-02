package com.pm.ticket;
//SeniorTicket price = NormalTicket*0.5

public class SeniorTicket extends StudentTicket{
    public SeniorTicket(Station start, Station destination,String types, int number) {
        super(start, destination, types, number);
    }
    public int getPrice() {
        return (int)(price*0.5f);
    }
}
