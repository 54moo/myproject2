package com.pm.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack",20,80);
        Student hank = new Student("Hank",80,90);
        GraduateStudent jane = new GraduateStudent("Jane",90,65,75);

        jack.print();
        hank.print();
        jane.print();
    }
}
