package dev.perfectbogus.concurrency;

public class ThreadInterruptedExample implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
                continue;
            } catch (InterruptedException e){
                //do nothing
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadInterruptedExample());

        t1.start();

        try{
            Thread.sleep(5000);
            t1.interrupt();
        } catch (InterruptedException e){
            //nothing to do
        }
    }
}
