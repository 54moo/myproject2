package com.pm.ticket;
//ReturnTicket price = NormalTicket*2(number)*0.9

public class ReturnTicket extends SeniorTicket{
    public ReturnTicket(Station start, Station destination,String types, int number) {
        super(start, destination, types, number);
    }
    public int getPrice() {
        return (int)((price*2)*0.9f);
    }
}
