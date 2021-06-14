package dev.perfectbogus.concurrency;

public class ThreadJoinExample implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i <= 5 ; i++){
            System.out.println(i + " " + Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            } catch (InterruptedException ex){
                System.out.println("I'm Interrupted" );
            }
        }
    }

    public static void main(String[] args) {
        Runnable task = new ThreadJoinExample();
        Thread thread = new Thread(task);
        thread.start();

        Thread thread2 = new Thread(task);
        Thread thread3  = new Thread(task);

        thread2.start();
        thread3.start();


        try{
            thread.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e){
            //do nothing
        }
        System.out.println("Im " + Thread.currentThread().getName());
    }
}
