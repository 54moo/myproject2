package com.pm.score;

public class Student {
    String name;
    int english;
    int math;

    public Student (String name){ //Constructor
        this.name = name;
    }

    public Student (String name,int english,int math){ //Constructor
        this(name);
        //this.name = name;
        this.english = english;
        this.math = math;
    }

    public Student (){ //Default Constructor
    }

    public int getAverage(){
        return (english+math)/2;
    }

    public void print(){
        System.out.print(name + "\t" + english + "\t" + math + "\t"
                + getAverage() );
        if (getAverage() < 60){
            System.out.print("*");
        }
        System.out.println();
    }
}