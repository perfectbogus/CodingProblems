package dev.perfectbogus.linkedinL.garbageCollection;

public class CompareStrings {

    public static void main(String[] args) {
        String one = "hello";
        String two = "hello";

        if(one == two){
            System.out.println("they are the same object");
        }else{
            System.out.println("they are different object");
        }

        if(one.equals(two)){
            System.out.println("they have the same value");
        }else{
            System.out.println("they have different value");
        }

        // this difference is happen becuase the string is calculated
        String three = Integer.valueOf(76).toString();
        String four = "76";
        if(three == four){
            System.out.println("They are the same reference three and four String");
        }else{
            System.out.println("The are different reference three and four String");
        }

        if(three.equals(four)){
            System.out.println("They have the same value three and four string");
        }else{
            System.out.println("They have different value three and four strings");
        }

        String five = Integer.valueOf(76).toString().intern();
        String six = "76";
        if(five == six){
            System.out.println("They are the same reference three and four String");
        }else{
            System.out.println("The are different reference three and four String");
        }

        if(five.equals(six)){
            System.out.println("They have the same value three and four string");
        }else{
            System.out.println("They have different value three and four strings");
        }
    }
}
