package dev.perfectbogus.edabit;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    /**
     * Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as the sum of its factors, (equal to sum of its proper divisors) excluding the number itself.
     *
     * For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.
     *
     * Examples
     * checkPerfect(6) ➞ true
     *
     * checkPerfect(28) ➞ true
     *
     * checkPerfect(496) ➞ true
     *
     * checkPerfect(12) ➞ false
     *
     * checkPerfect(97) ➞ false
     * Notes
     * N/A
     * @param num
     * @return
     */
    public static boolean checkPerfect(int num){
        // get all the factors of num
        List<Integer> factors = new ArrayList<>();
        for(int i = 1 ; i < num; i++){
            if( num % i == 0){
                factors.add(i);
            }
        }
        int sum = factors.stream().reduce(0, Integer::sum);
        return sum == num;
    }

    public static boolean checkPerfect2(int num){

        List<Integer> factors = new ArrayList<>();

        int sum = factors.stream().reduce(0, Integer::sum);
        return true;
    }

}
