package dev.perfectbogus.bit;

/**
 * https://kingrayhan.medium.com/500-data-structures-and-algorithms-practice-problems-and-their-solutions-b45a83d803f0
 */

public class EvenOrOddProblem {

    /**
     * Topic where you can find more details:
     *      https://www.alphacodingskills.com/java/notes/java-operator-bitwise-and-assignment.phps
     *
     * @param args
     */

    public static void main(String[] args) {
        int n = 6;

        boolean a = isEven(n);
        System.out.println("Bitwise: " + a);

        boolean b = isEven(n + 1);
        System.out.println("Bitwise: " + b);
    }

    public static boolean isEven(int n){
        return (n & 1) != 0;
    }
}
