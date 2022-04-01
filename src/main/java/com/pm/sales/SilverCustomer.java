package com.pm.sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }

    public float getReturnMoney(){
        return (int)(amount*0.1f);
    }

    @Override
    public void print() {
        System.out.println(id + "\t" + amount + "\t" + (amount-geyOffMoney()) + "\t" + "(" + getReturnMoney() + ")" );
    }
}