package dev.perfectbogus.dailyCoding.NumbersOnList;

import java.util.HashSet;
import java.util.List;

public class NumbersOnList {

    /**
     * Given a list of numbers and a number k,
     * return whether any two numbers from the list add up to k.
     *
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     *
     * Bonus: Can you do this in one pass?
     *
     */
    public static boolean simpleSolution(int k, List<Integer> list){
        for(int pivote = 0; pivote < list.size() ; pivote++){
            for(int next = pivote + 1; next < list.size() ; next++){
                if( list.get(pivote) + list.get(next) == k){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean fastestSolution(int k, List<Integer> list){
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer x : list) {
            if (hashSet.contains(k - x)) {
                return true;
            } else {
                hashSet.add(x);
            }
        }
        return false;
    }

}
