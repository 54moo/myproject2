package com.pm.ticket;
//StudentTicket price = NormalTicket*0.8

public class StudentTicket extends Ticket {
    public StudentTicket(Station start, Station destination,String types, int number) {
        super(start, destination, types, number);
    }
    public int getPrice() {
        return (int)(price*0.8f);
    }
    public void print() {
        System.out.println("from " + start.name + " to " + destination.name + "\t" +  "(" + types + ")" + "\t" + number + "\t" + getPrice()*number);
    }
}