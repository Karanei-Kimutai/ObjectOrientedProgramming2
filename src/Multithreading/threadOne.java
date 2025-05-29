package Multithreading;

public class threadOne extends Thread{
    @Override
    public void run(){
        for(long i=0;i<1_000_000L;i++){
            System.out.println("Bing Chilling");
        }
    }
}
