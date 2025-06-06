package Multithreading.concurrencyWithThreads;

public class counter implements Runnable{
    private final sharedCounter sharedCounterObject;

    public counter(sharedCounter sharedCounterObject){
        this.sharedCounterObject = sharedCounterObject;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){//do in three phases, get sum 334 to 666, 667 to 999 get sum
            sharedCounterObject.increment();
        }
        System.out.println(Thread.currentThread().getName()+ " completed");
    }
}
