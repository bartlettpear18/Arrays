package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// Exercise 1 Calls
        /**
        Exercise1 e1 = new Exercise1();
        System.out.println(e1.evenSum());
        System.out.println(e1.sumSquares());
        e1.twoPower(20);
        e1.twoPowerPrint();
        System.out.println(e1.sumAB(3,7));
        System.out.println(e1.oddDigits(32677));
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(3);
        list.add(5);
        Exercise2 e2 = new Exercise2(list);
        System.out.println(e2.smallest());
        System.out.println(e2.largest());
    }
}
