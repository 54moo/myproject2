package com.pm;

public class ScoringNG {
    public static void main(String[] args) {
        // 5 students each english and math
        int[] englishs = {77, 80, 96, 55, 66};
        int[] maths = {90, 88, 75, 64, 55};
        String[] name = {"Kelly", "John", "Allen", "Jane", "Miko"};
        for (int i = 0; i < 5; i++) {
            if (i != 1) {
                System.out.println(name[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t" + (englishs[i] + maths[i]) / 2);
            }
        }

    }
}
