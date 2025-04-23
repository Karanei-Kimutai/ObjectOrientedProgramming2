package Exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        int age;
        Scanner inputscanner=new Scanner(System.in);
        System.out.println("Enter your age:");
        age=inputscanner.nextInt();
        switch(age){
            case 36:
                System.out.println("You should vie for MCA");
            break;
            case 50:
                System.out.println("You should vie for president");
            break;
            case 45:
                System.out.println("You should vie for MP");
            break;
            case 55:
                System.out.println("You should vie for Senator");
            break;
            default:
                System.out.println("Contact us for support");
        }
    }
}
