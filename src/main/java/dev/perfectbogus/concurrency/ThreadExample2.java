package dev.perfectbogus.concurrency;

public class ThreadExample2 implements Runnable{

    public void run() {
        System.out.println("My name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable task = new ThreadExample2();
        Thread t2 = new Thread(task);
        t2.start();

        ThreadExample2 task2 = new ThreadExample2();
        Thread t3 = new Thread(task2);
        t3.start();

        System.out.println(Thread.currentThread().getName());
    }
}
