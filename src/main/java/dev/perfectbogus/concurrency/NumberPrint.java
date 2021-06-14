package dev.perfectbogus.concurrency;

public class NumberPrint implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <= 5 ; i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ex){
                System.out.println("I'm Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Runnable task = new NumberPrint();
        Thread thread = new Thread(task);

        thread.start();
    }
}
