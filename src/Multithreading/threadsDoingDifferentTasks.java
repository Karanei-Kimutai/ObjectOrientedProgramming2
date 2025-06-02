package Multithreading;


public class threadsDoingDifferentTasks {
    public static void main(String[] args) throws InterruptedException {
        threadOne firstThread=new threadOne();
        Thread secondThread=new Thread(new threadTwo());
        /*
        firstThread.setPriority(Thread.MIN_PRIORITY);
        secondThread.setPriority(Thread.MAX_PRIORITY);
        //The OS scheduler does not care about the given priority, it allocates threads time depending on it's availability
        firstThread.start();
        System.out.println(firstThread.getPriority());
        secondThread.start();
        System.out.println(secondThread.getPriority());
         */


        //Testing sequential vs parallel execution
        //Parallel execution
        long startTime=System.nanoTime();
        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

        long endTime=System.nanoTime();
        long duration=endTime-startTime;

        //Sequential execution
        long startTime2=System.nanoTime();
        firstThread.run();
        secondThread.run();
        long endTime2=System.nanoTime();
        long duration2=endTime2-startTime2;



        System.out.println("Time taken for parallel execution: "+duration/(1_000_000_000.0)+" seconds");
        System.out.println("Time taken for sequential execution: "+duration2/(1_000_000_000.0)+" seconds");



        /*
       //Thread with method vs thread with the code instead-Thread with method is faster
        threadThree thirdThread=new threadThree();
        long startTime3=System.nanoTime();
        thirdThread.start();
        thirdThread.join();
        long endTime3=System.nanoTime();
        long duration3=endTime3-startTime3;
        System.out.println("Time taken: "+duration3/(1_000_000_000.0)+" seconds");


        long startTime4=System.nanoTime();
        secondThread.start();
        secondThread.join();
        long endTime4=System.nanoTime();
        long duration4=endTime4-startTime4;
        System.out.println("Time taken: "+duration4/(1_000_000_000.0)+" seconds");
        */



    }
}
