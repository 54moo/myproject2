package com.pm.sales;

//  Customer         ->  ????
//  SliverCustomer   ->  ???? + [()*0.1]
//  GoldenCustomer   ->  ()*0.9 + [()*0.1]
//  PlatinumCustomer ->  ()*0.7 + [()*.02]

//  [level]             [id]   [cost]  [spend]  [open point]
//  (Customer)          0001    1200    1100     (0)
//  (Customer)          0002    800     800      (0)
//  (SliverCustomer)    0003    1800    1700     (180)
//  (GoldenCustomer)    0004    2100    1890     (210)
//  (PlatinumCustomer)  0005    3500    2450     (700)
public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("0002", 800);
        SilverCustomer c3 = new SilverCustomer("0003", 1800);
        GoldenCustomer c4 = new GoldenCustomer("0004", 2100);
        PlatinumCustomer c5 = new PlatinumCustomer("0005", 3500);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
    }
}