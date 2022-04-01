package com.pm.sales;

//  Customer         ->  ???? (man qian song bai)
//  SliverCustomer   ->  ???? + [()*0.1]
//  GoldenCustomer   ->  ()*0.9 + [()*0.1]
//  PlatinumCustomer ->  ()*0.7 + [()*.02]

import java.util.ArrayList;
import java.util.List;

//  [level]             [id]   [cost]  [spend]  [open point]
//  (Customer)          0001    1200    1100     (0)
//  (Customer)          0002    800     800      (0)
//  (SliverCustomer)    0003    1800    1700     (180)
//  (GoldenCustomer)    0004    2100    1890     (210)
//  (PlatinumCustomer)  0005    3500    2450     (700)
public class SalesTester {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(800);
        list.add(1200);

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001", 1200));
        customers.add(new Customer("0002", 800));
        customers.add(new SilverCustomer("0003", 1800));
        customers.add(new GoldenCustomer("0004", 2100));
        customers.add(new PlatinumCustomer("0005", 3500));

        /*for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }*/

        for (Customer c : customers){
            c.print();
        }
    }
}