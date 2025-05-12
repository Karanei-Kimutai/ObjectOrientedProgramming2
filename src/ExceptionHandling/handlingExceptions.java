package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class handlingExceptions {
    //Exceptions are typically handled using a try catch block
    public static void verifyAge(int age){
        if (age < 18) {
            System.out.println("You are too young");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args){
        Scanner inputscanner=new Scanner(System.in);
        System.out.println("Enter your age here: ");
        try {
            //The try block contains the code that might throw the exception
            int age = inputscanner.nextInt();
            verifyAge(age);
        }catch (InputMismatchException e){
            //The catch block handles the exceptions thrown by the code in the try block, you can have multiple catch blocks
            System.out.println("Invalid input");
        }finally {
            System.out.println("The finally block"); //Contains code that executes regardless
        }

    }
}
