package dev.perfectbogus.concurrency;

public class TestThread extends Thread{

    public void run() {
        System.out.println("My name is " + getName());
    }

    public static void main(String[] args) {
        TestThread test1 = new TestThread();
        test1.start();
        System.out.println("My name is " + Thread.currentThread().getName());
    }
}
