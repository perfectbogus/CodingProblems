package dev.perfectbogus.dailyCoding;

import java.util.Arrays;

public class CalculateMaximumSubarraySum {

    public static void main(String[] args){
        int[] array = {34, -50, 42, 14, -5, 86};
        System.out.println(maximumCircularSubarray(array));
    }

    /**
     *
     * Given an array of numbers, :find the maximum sum of any contiguous subarray of the array.
     *
     * For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137,
     * since we would take elements 42, 14, - 5 , and 86. Given the array [ -5, -1, -8, -9],
     * the maximum sum would be 0, since we would choose not to take any elements.
     */
    public static int solution(int[] array){
        if(array.length == 1){
            return array[0];
        } else if (array.length == 2) {
            return Math.max(
                    solution(Arrays.copyOfRange(array, 1, array.length - 1)),
                    solution(Arrays.copyOfRange(array, 2, array.length -1))
            );
        }
        return 0;
    }

    public static int maximumCircularSubarray(int[] array){
        int maxSubarraySumWraparound = sum(array) - minSubarraySum(array);
        return Math.max(maxSubarraySum(array), maxSubarraySumWraparound);
    }

    public static int sum(int[] array){
        int sum = 0;
        for(int x : array){
            sum += x;
        }
        return sum;
    }

    public static int maxSubarraySum(int[] array){
        int maxEndingHere = 0;
        int maxSoFar = 0;

        for(int x : array){
            maxEndingHere = Math.max(x, maxEndingHere + x);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static int minSubarraySum(int[] array){
        int minEndingHere = 0;
        int minSoFar = 0;

        for(int x: array){
            minEndingHere = Math.min(x, minEndingHere + x);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        return minSoFar;
    }

}
