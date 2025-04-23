/*Write a program that gets the sum of the odd numbers from 1 to 20 inclusive.
Write the program using  for, while and do…while loops (3 different programs)*/


package Exercises;

public class Exercise1 {
    public static void main(String[] args){
        int sum=0;
         //Using the for loop
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to 20 is: "+sum);

        //Using the while loop
        int j=1;
        int sum2=0;
        while(j<=20){
            if(j%2!=0){
                sum2+=j;
            }
            j++;
        }
        System.out.println("The sum of odd numbers from 1 to 20 is: "+sum2);

        //Using the do while loop
        int k=1;
        int sum3=0;
        do{
            if(k%2!=0){
                sum3+=k;
            }
            k++;

        }while(k<=20);
        System.out.println("The sum of odd numbers from 1 to 20 is: "+sum3);


    }
}
