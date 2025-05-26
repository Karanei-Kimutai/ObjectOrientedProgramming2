package Multithreading;

public class multithreadingExample2 implements Runnable {
    private String threadName;
    public multithreadingExample2(String threadName){
        this.threadName=threadName;
    }


    @Override
    public void run(){
        try{
            if(threadName.equals("Thread-3")){
                throw new RuntimeException("Exception to show thread independence");
            }
            for(int i=0;i<5;i++){
                System.out.println(threadName+": "+i);
                Thread.sleep(300);
            }
        }catch(Exception e){
            System.out.println(threadName+": Caught exception "+ e.getMessage());
        }

    }
    public static void main(String[] args){
        //If you're creating threads using the Runnable interface, you have to use the Runnable interface as a data type
        /*Runnable runnableThread1=new multithreadingExample2("Thread-1");
        Runnable runnableThread2=new multithreadingExample2("Thread-2");
        Thread t1=new Thread(runnableThread1);
        Thread t2=new Thread(runnableThread2);
        t1.start();
        t2.start();*/


        for(int i=0;i<5;i++){
            Thread threadExample=new Thread(new multithreadingExample2("Thread-"+i));
            threadExample.start();
        }
    }
}
