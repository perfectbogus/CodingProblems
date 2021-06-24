package dev.perfectbogus.dailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product
 * of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class ProductNumbers {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        List<Integer> result = authorSolution(nums);
        System.out.println(result);
    }

    public static int[] nonDivisionSolution(int[] data){
        int[] output = new int[data.length];
        for(int i = 0; i < data.length; i++){
            int sum = 0;
            for( int j = 0; j < data.length ; j++){
                if(i != j){
                    if(sum == 0){
                        sum = data[j];
                    } else {
                        sum = sum * data[j];
                    }
                }
            }
            output[i] = sum;
        }
        return output;
    }

    public static int[] divisionSolution(int[] data){
        int[] out = new int[data.length];
        for (int i = 0; i < data.length; i++){
            int prev = data[i];
            for (int j = 0; j < data.length; j++) {
                if( i != j)
                    prev = prev * data[j];
            }
            out[i] = prev / data[i];
        }
        return out;
    }

    public static int[] reverse(int[] nums){
        int[] aux = new int[nums.length];
        int j = 0;
        for(int i = nums.length - 1; i >= 0; i--  ){
            aux[j] = nums[i];
            j++;
        }
        return aux;
    }

    public static List<Integer> authorSolution(int[] nums){
        List<Integer> prefixProducts = new ArrayList<>();
        for(int num : nums){
            if( prefixProducts.size() > 0 ){
                int mult = prefixProducts.get(prefixProducts.size() - 1 ) * num;
                prefixProducts.add(mult);
            } else {
                prefixProducts.add(num);
            }
        }
        List<Integer> suffixProducts = new ArrayList<>();
        int[] reversedNums = reverse(nums) ;

        for(int num: reversedNums){
            if( suffixProducts.size() > 0){
                int mult = suffixProducts.get(prefixProducts.size() - 1) * num;
                prefixProducts.add(mult);
            } else {
                suffixProducts.add(num);
            }
        }

        Collections.reverse(suffixProducts);

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            if(i == 0){
                result.add(suffixProducts.get(i + 1));
            } else if( i == nums.length - 1 ){
                result.add(prefixProducts.get(i - 1));
            } else {
                result.add(prefixProducts.get(i -1) * suffixProducts.get(i + 1));
            }
        }
        return result;
    }
}

