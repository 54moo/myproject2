package com.pm;
public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public void print() {
        System.out.println(
                id + "\t" + amount + "\t" + (amount-backMoney()) +
                        "("+backMoney()+")");
        System.out.println(id + "\t" + amount + "\t" +
                (amount-backMoney()) +
                "(" + backMoney() + ")");
    }
}