package com.pm;

public class Student {
        String name;
        int english;
        int math;
    public void print(){
        int average = (english+math)/2;
        System.out.print(name + "\t" + english + "\t" + math + "\t"
                + average );
        if (average < 60){
            System.out.println("*");
        }
    }
}
