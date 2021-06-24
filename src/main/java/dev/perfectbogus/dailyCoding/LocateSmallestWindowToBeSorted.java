package dev.perfectbogus.dailyCoding;

import java.util.Arrays;

public class LocateSmallestWindowToBeSorted {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 7, 5, 6, 8, 9};

        System.out.println(Arrays.toString(array));
        Range sol = solution(array);
        System.out.println(sol.left);
        System.out.println(sol.right);


        System.out.println(Arrays.toString(array));
        Range range = anotherSolution(array);
        System.out.println(range.left);
        System.out.println(range.right);
    }

    /**
     * this solution takes O(nlogn) time and space?
     * @param array
     * @return
     */
    public static Range solution(int[] array) {
        int left = -1;
        int right = Integer.MAX_VALUE;
        int[] copy = array.clone();

        Arrays.sort(copy);

        for(int i = 0; i < copy.length; i++){
            if(array[i] != copy[i] && left == -1){
                left = i;
            } else if(array[i] != copy[i]){
                right = i;
            }
        }


        return new Range(left, right);
    }

    /**
     * this solutions is O(n) time and O(1) space
     *
     * Details that need to be pointed (for easy solution):
     *  1: You can notice that the begining of the array could be order
     *  2: the end of the array could be ordered
     * you can take advantage of looping the array one side forward or backward.
     *
     * the constraint that you need to consider is if the next number and is ordered with respect with the
     * back number.
     *
     * you need to save(storage) when the numbers are not ordered up or down.
     *
     *
     * @param array
     * @return
     */
    public static Range anotherSolution(int[] array){
        int left = -1;
        int right = Integer.MAX_VALUE;
        int n = array.length;

        int maxSeen = Integer.MIN_VALUE;
        int minSeen = Integer.MAX_VALUE;

        for(int i = 0; i < n ; i++){
            maxSeen = Math.max(maxSeen, array[i]);
            if( array[i] < maxSeen){
                right = i;
            }
        }

        for(int i = n - 1; i > -1; i-- ){
            minSeen = Math.min(minSeen, array[i]);
            if( array[i] > minSeen ){
                left = i;
            }
        }
        return new Range(left,right);
    }

    public static class Range {
        int left;
        int right;

        public Range(int left, int right) {
            this.left = left;
            this.right = right;
        }

    }


}
