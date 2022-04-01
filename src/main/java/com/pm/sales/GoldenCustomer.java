package com.pm.sales;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }

    public float discount(){
        return (int)(amount*0.9);
    }

    public void print() {
        System.out.println(id + "\t" + amount + "\t" + discount() + "\t" + "(" + getReturnMoney() + ")" );
    }
}
