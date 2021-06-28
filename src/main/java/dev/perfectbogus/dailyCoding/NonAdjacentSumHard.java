package dev.perfectbogus.dailyCoding;

import java.util.Arrays;
import java.util.Collections;

public class NonAdjacentSumHard {

    /**
     * Given a list of integers, write a function that returns the largest sum of non-adjacent numbers.
     * Numbers can be 0 or negative.
     *
     * For example,
     *
     * [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5.
     *
     * [5, 1, 1, 5] should return 10, since we pick 5 and 5.
     *
     * Follow-up: Can you do this in O(N) time and constant space?
     * @param args
     */

    public static void main(String[] args){
        int[] list = {2, 4, 6, 2, 5};
        /*
        2,6,5
        2,2
        4,2
        2,6,5

         */
        int[] list2 = {5, 1, 5, 1};
        int otherInt = anotherSolution(list);
        System.out.println(otherInt);

        int sol = simpleSolution(list);
        System.out.println(sol);
        int sol2 = simpleSolution(list2);
        System.out.println(sol2);

        Collections.reverse(Arrays.asList(list2));
        System.out.println();
    }

    public static int simpleSolution(int[] list){
        int biggest = Integer.MIN_VALUE;
        for(int pivot = 0 ; pivot < list.length / 2; pivot++){
            for(int space = 2; space < list.length ; space++){
                int mult = 0;
                int sum = 0;
                while(mult * space < list.length){
                    sum += list[mult * space];
                    mult++;
                }
                if(sum > biggest){
                    biggest = sum;
                }
            }
        }
        return biggest;
    }

    public static int anotherSolution(int[] arr){
        int s2 = Math.max(Integer.MIN_VALUE, arr[0]);
        int s1 = Math.max(s2, arr[1]);
        for(int k = 2; k < arr.length; k++){
            int s0 = Math.max(s1, s2 + arr[k]);
            s2 = s1;
            s1 = s0;
        }
        return s1;
    }
}
