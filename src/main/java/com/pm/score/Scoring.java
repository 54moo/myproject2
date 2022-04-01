package com.pm.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack",20,80));
        students.add(new Student("Hank",80,90));
        students.add(new GraduateStudent("Jane",90,65,75));

        for (Student stu : students){
            stu.print();
        }
    }
}
