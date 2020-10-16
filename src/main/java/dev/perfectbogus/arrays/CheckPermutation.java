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
}
