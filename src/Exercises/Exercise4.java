package Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner inputscanner=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int monthnumber=inputscanner.nextInt();
        while(monthnumber<0||monthnumber>12){
            System.out.println("Enter a valid month number:");
            monthnumber=inputscanner.nextInt();
        }
        if(monthnumber>=1&&monthnumber<=3){
            System.out.println("Winter");
        }
        else if(monthnumber>=4&&monthnumber<=6){
            System.out.println("Winter");
        }
        else if(monthnumber>=7&&monthnumber<=9){
            System.out.println("Winter");
        }
        else if(monthnumber>=10&&monthnumber<=12){
            System.out.println("Winter");
        }


    }
}
