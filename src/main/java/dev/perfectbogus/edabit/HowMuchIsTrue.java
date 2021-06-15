package dev.perfectbogus.edabit;

public class HowMuchIsTrue {

    /**
     * Create a function which returns the number of true values there are in an array.
     *
     * Examples:
     *
     * countTrue([true, false, false, true, false]) ➞ 2
     *
     * countTrue([false, false, false, false]) ➞ 0
     *
     * countTrue([]) ➞ 0
     */
    public static int countTrue(boolean[] arr){
        int count = 0;
        for(boolean x : arr)
            if(x) count++;
        return count;
    }
}
