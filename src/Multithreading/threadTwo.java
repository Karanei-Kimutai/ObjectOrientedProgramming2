package Multithreading;

public class threadTwo implements Runnable {
    @Override
    public void run(){
        double result = 0;
        for (int i = 0; i < 100_000_000; i++) {
            result += Math.cbrt(i); // Different CPU work
        }
        System.out.println("ThreadTwo done, result = " + result);
    }
}
