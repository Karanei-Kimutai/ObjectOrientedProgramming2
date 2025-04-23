package Exercises_Mukundi;

public class Exercise1 {
    public static void main(String[] args){
        int sum = 0;

        for (int i = 1; i<=20; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to 20 is: " + sum);
    }

}
