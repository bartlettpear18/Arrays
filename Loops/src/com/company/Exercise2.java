package com.company;
import java.util.ArrayList;

/**
 * Created by Joel.Bartlett18 on 4/12/2017.
 */
public class Exercise2 {

    ArrayList<Integer> list = new ArrayList<Integer>();

    /**
     * construtor initalizes sequence of integers
     */
    public Exercise2(ArrayList<Integer> list)  {
        this.list = list;
    }

    /**
     * returns smallest of int list
     * @return int
     */
    public int smallest() {
        int smallest = list.get(1);
        for (int i: list) {
            if(i <= smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    /**
     * returns largest of int list
     * @return int
     */
    public int largest() {
        int largest = list.get(1);
        for (int i: list) {
            if (i >= largest) {
                largest = i;
            }
        }
        return largest;
    }

    /**
     * returns list of even ints
     */



}
