package dev.perfectbogus.edabit;

public class ArraySumRecursiveHard {

    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int a = arr.length / 2;
            int b;
            if (arr.length % 2 == 0) {
                b = a;
            } else {
                b = a + 1;
            }
            int[] first = new int[a];
            int[] second = new int[b];

            for (int i = 0; i < a; i++) {
                first[i] = arr[i];
            }

            int h = 0;
            for(int i = a; i < arr.length; i++){
                second[h++] = arr[i];
            }
                return sum(first) + sum(second);
        }
    }
}
