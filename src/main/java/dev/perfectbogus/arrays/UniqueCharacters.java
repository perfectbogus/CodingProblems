package dev.perfectbogus.arrays;

/**
 * Problem:
 *  Is unique: Implement an algorithm to determine if a string has all unique characters.
 *  What if you cannot use additional data structure.
 */

public class UniqueCharacters {

    public static boolean uniqueCharacters(char[] data){
        for (int i = 0; i < data.length; i++){
            for(int j = i - 1; j >= 0 ; j--){
                if(data[i] == data[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
