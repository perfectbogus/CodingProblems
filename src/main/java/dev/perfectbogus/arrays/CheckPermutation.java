package dev.perfectbogus.arrays;

public class CheckPermutation {
    /**
     * Notes:
     *  - Validate Same Size of Strings
     *  - May sort and compare will help to solve this
     *  - What happen with the Space
     */
    public static boolean isPermutations(String a, String b){
        if(a.length() != b.length()) return false;
        return sort(a).equals(sort(b));
    }

    public static String sort(String str){
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    /**
     * Another Solution:
     *
     * Assumptions:
     *    128 Characters
     */
    public static boolean isPermutationsN(String a, String b){
        if(a.length() != b.length()) return false;

        // By default all spaces are 0
        int[] letters = new int[128];
        char[] a_array = a.toCharArray();
        for(char c : a_array){
            letters[c]++;
        }

        for(int i = 0; i < b.length(); i++){
            int c = (int) b.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        
        return true;
    }

}
