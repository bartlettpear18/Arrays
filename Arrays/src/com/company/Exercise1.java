package com.company;

/**
 * Created by Joel.Bartlett18 on 4/18/2017.
 */
public class Exercise1 {
    private int[] arr;

    public Exercise1 (int length) {
        arr = new int[length];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = (int) Math.floor(Math.random()*10);
        }
    }

    public void print() {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void printEven() {
        System.out.println();
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public void printEvenInts() {
        System.out.println();
        for (int i : arr) {
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void reverse() {
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public void firstLast() {
        System.out.println();
        System.out.println(arr[0] + " " + arr[arr.length -1]);
    }

    public void all() {
        printEven();
        printEvenInts();
        reverse();
        firstLast();
    }

}
