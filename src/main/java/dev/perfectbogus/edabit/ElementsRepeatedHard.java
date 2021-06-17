package dev.perfectbogus.edabit;

import java.util.*;

public class ElementsRepeatedHard {

    /**
     * Given an array, create a function that returns an object detailing how many times each element was repeated. Sort the object by value in descending order.
     *
     * Examples
     * countRepetitions(["cat", "dog", "cat", "cow", "cow", "cow"]) ➞ {"cow"=3, "cat"=2, "dog"=1}
     *
     * countRepetitions([1, 5, 5, 5, 12, 12, 0, 0, 0, 0, 0, 0]) ➞ {0=6, 5=3, 12=2, 1=1}
     *
     * countRepetitions(["Infinity", "null", "Infinity", "null", "null"]) ➞ {"null"=3, "Infinity"=2}
     * Notes
     * The array elements can be anything from string to numeric types.
     * The returned map object should be sorted in descending order by value.
     * @param e
     * @return
     */
    public static Map<Object, Integer> countRepetitions(Object[] e){
        Map<Object, Integer> map = new LinkedHashMap<>();

        for(Object o: e){

            if(map.containsKey(o)){
                map.put(o, map.get(o) + 1);
            } else {
                map.put(o, 1);
            }
        }

        int min;
        Map<Object, Integer> aux = new LinkedHashMap<>();
        while(map.size() > 0){
            Object minO = null;
            int minN = Integer.MIN_VALUE;
            for(Map.Entry<Object, Integer> entry: map.entrySet()){
                int currentCount = entry.getValue();
                Object currentObj = entry.getKey();
                if(currentCount > minN){
                    minN = currentCount;
                    minO = currentObj;
                }
            }
            map.remove(minO);
            aux.put(minO, minN);
        }


        return aux;
    }
}
