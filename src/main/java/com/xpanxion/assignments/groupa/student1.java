package com.xpanxion.assignments.groupa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student1 {

    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {


        int[] ints = {1, 2, 3};
        var intList = new ArrayList<Integer>(ints.length);
        for (int i : ints)
        {
            intList.add(i);
        }


        System.out.println(addNumbers(intList));

        //System.out.println("Ex. 1");
    }

    private static Integer addNumbers(ArrayList<Integer> numList) {
        // TODO: Implement this function.
        return 0;
    }


    private static void ex2() {

        System.out.println("Ex. 2");
    }

    private static void ex3() {

        System.out.println("Ex. 3");
    }
}

