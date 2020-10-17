package dev.perfectbogus.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRotation {

    public static void main(String[] args) {
        String a = "sabrosa";
        String b = "bro";
        System.out.println(isSubstring(a,b));
    }

    public static boolean isRotated(String a, String b){
        int len = a.length();
        if(len == b.length() && len > 0){
            String concat = a + a;
            return isSubstring(concat, b);
        }
        return false;
    }

    private static boolean isSubstring(String a, String b){
        Pattern pattern = Pattern.compile(b);
        Matcher matcher = pattern.matcher(a);
        return matcher.find();
    }
}
