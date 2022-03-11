package com.pm;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack",20,80);
        Student hank = new Student("Hank",80,90);
        GraduateStudent jane = new GraduateStudent("Jane");

        jack.print();
        hank.print();
        jane.print();
    }
}
