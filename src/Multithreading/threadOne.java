package Multithreading;

public class threadOne extends Thread{
    @Override
    public void run(){
            double result = 0;
            for (int i = 0; i < 100_000_000; i++) {
                result += Math.sqrt(i); // Simulate CPU work
            }
            System.out.println("ThreadOne done, result = " + result);
    }
}
