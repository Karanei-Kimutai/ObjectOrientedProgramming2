package Multithreading.concurrencyWithThreads;

public class sharedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }//The synchronized keyword ensures that only one thread can use this method at a time

    public int getCount(){
        return count;
    }

}
