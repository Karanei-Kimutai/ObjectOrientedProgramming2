package Exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner inputscanner=new Scanner(System.in);
        System.out.println("Enter the amount spent by the customer:");
        double amountspent=inputscanner.nextDouble();
        double discount;
        double amount_to_be_paid;
        if(amountspent<10000){
            discount=0;
            amount_to_be_paid=amountspent-(amountspent*discount);
            System.out.println("Amount to be paid: "+amount_to_be_paid+" Zero percent discount applied");
        }else if(amountspent>=10000&&amountspent<20000){
            discount=0.1;
            amount_to_be_paid=amountspent-(amountspent*discount);
            System.out.println("Amount to be paid: "+amount_to_be_paid+" Ten percent discount applied");
        }else if(amountspent>=20000&&amountspent<30000){
            discount=0.15;
            amount_to_be_paid=amountspent-(amountspent*discount);
            System.out.println("Amount to be paid: "+amount_to_be_paid+" Fifteen percent discount applied");
        }else if(amountspent>=30000&&amountspent<40000){
            discount=0.2;
            amount_to_be_paid=amountspent-(amountspent*discount);
            System.out.println("Amount to be paid: "+amount_to_be_paid+" Twenty percent discount applied");
        }else if(amountspent>=40000){
            discount=0.25;
            amount_to_be_paid=amountspent-(amountspent*discount);
            System.out.println("Amount to be paid: "+amount_to_be_paid+" Twenty five percent discount applied");
        }
    }
}
