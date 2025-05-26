package Multithreading;

public class multithreadingExample extends Thread{
    @Override
    public void run(){
        if(getName().equals("Thread-3")){
            throw new RuntimeException("Exception to show how threads are independent from each other");
        }
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        /*
        multithreadingExample thread1=new multithreadingExample();
        multithreadingExample thread2=new multithreadingExample();
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread1.start();
        thread2.start();
      */
        //To create multiple threads at the same time, you can use a loop
        for(int i=0;i<5;i++){
            multithreadingExample thread=new multithreadingExample();
            thread.setName("Thread-"+i);
            thread.start();

        }
    }
}
