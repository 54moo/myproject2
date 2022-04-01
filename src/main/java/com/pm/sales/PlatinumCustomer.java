package com.pm.sales;

public class PlatinumCustomer extends GoldenCustomer{
    public PlatinumCustomer(String id, int amount){
        super(id, amount);
    }

    @Override
    public float discount() {
        return (int)(amount*0.7);
    }

    @Override
    public float getReturnMoney() {
        return (int)(amount*0.2f);
    }
}
