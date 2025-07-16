package Multithreading.concurrencyWithThreads;

public class counter implements Runnable{
    private final sharedCounter sharedCounterObject;

    public counter(sharedCounter sharedCounterObject){
        this.sharedCounterObject = sharedCounterObject;
    }

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            sharedCounterObject.increment();
        }
        System.out.println(Thread.currentThread().getName()+ " completed");
    }
}
