package com.company;

import javax.xml.stream.events.Comment;

public class Main {

    public static void main (String args[]){
        calcSum(2, 9);
    }

    static void calcSum (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}