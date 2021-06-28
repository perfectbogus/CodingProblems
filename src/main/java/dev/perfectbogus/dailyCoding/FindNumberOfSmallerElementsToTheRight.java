package dev.perfectbogus.dailyCoding;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfSmallerElementsToTheRight {

    public static void main(String[] args){
        int[] array = {3, 4, 9, 6 ,1};

        int[] reversed = reverse(array);

        System.out.println(Arrays.toString(reversed));


        Map<Integer, Integer> map = new TreeMap<>();

        map.put(3, 1);
        System.out.println(map);
        map.put(4, 1);
        System.out.println(map);
        map.put(9, 1);
        System.out.println(map);
        map.put(6, 1);
        System.out.println(map);
        map.put(1, 1);

    }

    /**
     *  Given an array of integers, return a new array where each element in the new array
     *  is the number of smaller elements to the right of that element in the original input array.
     * For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1,
     * • There is 1 smaller element to the right of 3
     * • There is 1 smaller element to the right of 4
     * • There are 2 smaller elements to the right of 9 • There is 1 smaller element to the right of 6
     * • There are no smaller elements to the right of 1
     */
    public static int[] solution(int[] arrays){
        Map<Integer, Integer> map = new TreeMap<>();
        int[] result = new int[arrays.length];
        int[] seen = new int[arrays.length];




        return new int[1];
    }

    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        int j = 0;
        for(int i = array.length - 1; i > -1 ; i--){
            reversed[j] = array[i];
            j++;
        }
        return reversed;
    }

}
