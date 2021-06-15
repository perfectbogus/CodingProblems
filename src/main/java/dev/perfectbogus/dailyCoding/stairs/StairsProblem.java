package dev.perfectbogus.dailyCoding.stairs;

import java.util.*;

public class StairsProblem {

    public static void main(String[] args) {
        int data = stairCase(4, Arrays.asList(1,2));
        System.out.println(data);
    }

    public static int stairCase(int n, List<Integer> list){
        if( n < 0 ) {
            return 0;
        } else if ( n == 0 ){
            return 1;
        } else {
            int temp = 0;
            for(int x : list ){
                temp += stairCase(n - x, list);
            }
            return temp;
        }
    }

}
