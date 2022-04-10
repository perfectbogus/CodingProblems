package dev.perfectbogus.edabit;

public class SevenBoomHard {

    public static String isBoom(int[] data){
        for(int i = 0; i < data.length; i++){
            final String iString = Integer.toString(data[i]);
            if(iString.contains("7"))
                return "Boom!";
        }
        return "there is no 7 in the array";
    }
}
