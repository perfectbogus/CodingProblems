package dev.perfectbogus.exceptions;

public class CalculateException {
    int a;

    public CalculateException(int a) {
        this.a = a;
    }

    public int add() {
        a = a + 10;
        try {
            a = a + 10;
            try {
                a = a * 10;
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Catching Exception first time");
                a = a - 10;
            }
        } catch (Exception e) {
            System.out.println("Catching exception on second time");
            a = a - 10;
        }
        return a;
    }
}
