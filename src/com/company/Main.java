package com.company;

import javax.xml.stream.events.Comment;

public class Main {

    public static void main (String args[]){
        int Res = calcSum(2, 9);
        System.out.println(Res);
    }

    static int calcSum (int a, int b) {
        int sum = a + b;

        return sum;

    }
}