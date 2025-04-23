/*As at the year 2024, Joan is 8 years old.
Use a for loop to write a program that determines the year of her 10th birthday.*/

package Exercises;

public class Exercise3 {
    public static void main(String[] args){
        int currentyear=2024;
        for(int age=8;age<10;age++){
            currentyear++;
        }
        System.out.println("Joan will be 10 years old in the year: "+currentyear);
    }

}
