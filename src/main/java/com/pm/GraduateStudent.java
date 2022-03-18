package com.pm;
public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name,
                           int english,
                           int math,
                           int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        int average = (english+math)/2;
        System.out.println(name+"\t"+english+"\t"+
                math + "\t" + average +
                "\t" + thesis);
    }
}