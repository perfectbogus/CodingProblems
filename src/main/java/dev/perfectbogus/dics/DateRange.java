package dev.perfectbogus.dics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DateRange {

    public static void main(String[] args) {
        int[][] dataSet = {{1900, 1905}
                , {1904, 1910}
                , {1909, 1915}
                , {1904, 1910}
                , {1909, 1916}
                , {1910, 1915}
                , {1900, 1906}};

        int[][] year = getYear(dataSet);
        System.out.println("Year:" + year[0][0]);
        System.out.println("Lived People: " + year[0][1]);
    }

    public static int[][] getYear(int data[][]) {
        HashMap<Integer, Integer> structure = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            int birthDate = data[i][0];
            int deathDate = data[i][1];
            for (int counter = birthDate; counter <= deathDate; counter++) {
                System.out.println("Year: " + counter);
                if (structure.containsKey(counter)) {
                    int hist = structure.get(counter);
                    structure.put(counter, ++hist);
                    System.out.println("Times: " + hist);
                } else {
                    structure.put(counter, 1);
                }
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = structure.entrySet();
        int yearBig = Integer.MIN_VALUE;
        int valueBig = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry: entrySet){
            if(entry.getValue() > valueBig){
                yearBig = entry.getKey();
                valueBig = entry.getValue();
            }
        }
        int result[][] = {{yearBig, valueBig}};
        return result;
    }
}
