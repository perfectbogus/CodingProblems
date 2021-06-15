package dev.perfectbogus.edabit;

public class StringEnding {

    /**
     * Create a function that takes two strings and returns true if the first string ends with the
     * second string; otherwise return false.
     *
     * Examples
     * checkEnding("abc", "bc") ➞ true
     *
     * checkEnding("abc", "d") ➞ false
     *
     * checkEnding("samurai", "zi") ➞ false
     *
     * checkEnding("feminine", "nine") ➞ true
     *
     * checkEnding("convention", "tio") ➞ false
     * Notes:
     * All test cases are valid one word strings.
     */
    public static boolean checkEnding(String str1, String str2){
        if ( str2.length() > str1.length())
            return false;

        int syncIndex = str1.length() - str2.length();
        for(int index = 0 ; index < str2.length(); index++){
            if(str1.charAt(syncIndex) != str2.charAt(index)){
                return false;
            }
            ++syncIndex;
        }
        return true;
    }
}
