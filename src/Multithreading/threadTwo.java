package Multithreading;

public class threadTwo implements Runnable {
    @Override
    public void run(){
        for(long i=0;i<1_000_000L;i++) {
            System.out.println("Giga Chad");
        }
    }
}
