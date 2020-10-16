package dev.perfectbogus.arrays;

/**
 * Problem:
 *  Is unique: Implement an algorithm to determine if a string has all unique characters.
 *  What if you cannot use additional data structure.
 */

public class UniqueCharacters {

    /**
     * My Solution
     * @param data
     * @return
     */
    public static boolean isUniqueCharacters(char[] data){
        for (int i = 0; i < data.length; i++){
            for(int j = i - 1; j >= 0 ; j--){
                if(data[i] == data[j]){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Optimal Solution
     * Implicit things:
     *      - ASCII has only 128 Characters so if you have an String bigger of that you will have repeated
     *      characters
     *
     * Mindset:
     * - You are going to use an array of 128 spaces in which you are going to store false or true of every
     * int value of the char
     * - By default on a boolean array all the spaces are false;
     */
    public static boolean isUniqueChar(String str){
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0 ; i < str.length(); i++){
            int val_letter = str.charAt(i);
            if(char_set[val_letter]){
                return false;
            }
            char_set[val_letter] = true;
        }
        return true;
    }
}
