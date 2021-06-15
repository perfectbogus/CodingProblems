package dev.perfectbogus.edabit;

import java.util.Arrays;

public class WarOfNumbersHard {

    public static int warOfNumbers(int[] numbers){
        int sumEven = 0;
        int sumOdds = 0;
        for(int x: numbers){
            if(x % 2 == 0){
                sumEven += x;
            } else {
                sumOdds += x;
            }
        }

        return sumEven > sumOdds ? sumEven - sumOdds: sumOdds - sumEven;
    }

    public static int anotherSolution(int[] numbers){
         return Math.abs(Arrays.stream(numbers).reduce(0, (a,b) -> (b & 1) == 1 ? a + b : a -b));
    }
}
