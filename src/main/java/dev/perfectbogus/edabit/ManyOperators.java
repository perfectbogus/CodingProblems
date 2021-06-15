package dev.perfectbogus.edabit;

public class ManyOperators {

    /**
     * Some basic arithmetic operators are +, -, *, /, and %. In this challenge you will be given three parameters, num1, num2, and an operator. Use the operator on number 1 and 2.
     *
     * Examples
     * operate(1, 2, "+") ➞ 3
     * // 1 + 2 = 3
     *
     * operate(7, 10, "-") ➞ -3
     * // 7 - 10 = -3
     *
     * operate(20, 10, "%") ➞ 0
     * // 20 % 10 = 0
     * Notes
     * There will no division by zero.
     */

    public static int operate(int a, int b, String op){
        switch (op){
            case "-":
                return a - b;
            case "+":
                return a + b;
            case "%":
                return a % b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }
}
