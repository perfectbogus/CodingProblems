package dev.perfectbogus.dailyCoding;

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
}
