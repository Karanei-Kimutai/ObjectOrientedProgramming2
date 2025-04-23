package Exercises_Mukundi;

public class Exercise3 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;

        do {
            if (i % 2 != 0){
                sum = sum + i;
            }
            i++;
        }
        while (i<=20);
        System.out.println("The total sum of odd numbers is: " +sum);
    }
}
