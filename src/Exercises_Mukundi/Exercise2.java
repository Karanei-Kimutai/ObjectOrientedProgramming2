package Exercises_Mukundi;

public class Exercise2 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;

        while(i<=20){
            if (i % 2 != 0){
                sum = sum + i;
            }
            i++;

        }
        System.out.println("The sum of odd numbers from 1 to 20 is: " + sum);
    }
}
