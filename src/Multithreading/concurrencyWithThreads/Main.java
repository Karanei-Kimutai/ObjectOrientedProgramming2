package Multithreading.concurrencyWithThreads;

public class Main {
    public static void main(String[] args){
        sharedCounter sharedCounterObject = new sharedCounter();

        //create and start multiple threads
        Thread thread1 = new Thread(new counter(sharedCounterObject),"Thread-1");
        Thread thread2 = new Thread(new counter(sharedCounterObject),"Thread-2");
        Thread thread3 = new Thread(new counter(sharedCounterObject),"Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        //wait for all threads to complete
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("Final counter value: "+sharedCounterObject.getCount());




    }
}
