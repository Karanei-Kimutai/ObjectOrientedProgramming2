package Multithreading;

public class threadThree extends Thread {

    public void gigaChadFunction(){
        for(int i=0;i<10;i++) {
            System.out.println("Giga Chad");
        }
    }
    @Override
    public void run(){
        gigaChadFunction();
    }
}
