package com.pm;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add("abc");
        System.out.println(list);
        int n1 = (int)list.get(0);
        int n2 = (int)list.get(3);
        String n3 = (String)list.get(4);
        System.out.println(list.size());
        System.out.println(n3);
        //arrayTest();
    }
}