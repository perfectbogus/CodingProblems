package dev.perfectbogus.edabit;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ElementsRepeatedHardTest {
    @Test
    public void test01() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("cow", 3);
        hashMap.put("cat", 2);
        hashMap.put("dog", 1);
        assertTrue(CompareMaps.equals(hashMap, ElementsRepeatedHard.countRepetitions(new Object[] {"cat", "dog", "cat", "cow", "cow", "cow"})), "Map should be sorted in descending order by value!");
    }

    @Test
    public void test02() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put(0, 6);
        hashMap.put(5, 3);
        hashMap.put(12, 2);
        hashMap.put(1, 1);
        assertTrue(CompareMaps.equals(hashMap, ElementsRepeatedHard.countRepetitions(new Object[] {1, 5, 5, 5, 12, 12, 0, 0, 0, 0, 0, 0})), "Map should be sorted in descending order by value!");
    }

    @Test
    public void test03() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("null", 3);
        hashMap.put("Infinity", 2);
        assertTrue(CompareMaps.equals(hashMap, ElementsRepeatedHard.countRepetitions(new Object[] {"Infinity", "null", "Infinity", "null", "null"})), "Map should be sorted in descending order by value!");
    }

    @Test
    public void test04() {
        Map<Object, Integer> hashMap = new LinkedHashMap<>();
        hashMap.put('E', 3);
        hashMap.put('D', 1);
        hashMap.put('P', 1);
        hashMap.put('X', 1);
        hashMap.put('A', 1);
        hashMap.put('V', 1);
        hashMap.put('I', 1);
        hashMap.put('R', 1);
        assertTrue(CompareMaps.equals(hashMap, ElementsRepeatedHard.countRepetitions(new Object[] {'D', 'E', 'E', 'P', 'X', 'A', 'V', 'I', 'E', 'R'})), "Map should be sorted in descending order by value!");
    }
}

class CompareMaps {
    public static boolean equals(Map<Object, Integer> a, Map<Object, Integer> b) {
        int[] x = a.values().stream().mapToInt(Integer::new).toArray(),
                y = b.values().stream().mapToInt(Integer::new).toArray();
        Object[] k = a.keySet().toArray(),
                l = b.keySet().toArray();
        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i] || !k[i].toString().equals(l[i].toString())) return false;
        }
        return true;
    }
}