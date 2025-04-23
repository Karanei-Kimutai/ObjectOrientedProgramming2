//Write a program that uses the while loop to list the next ten numbers in the series 1, 3, 5, …
package Exercises;

public class Exercise2 {
    public static void main(String[] args){
        int number=1;
        int j=1;
        while(number<=10){
            if(j%2!=0){
                System.out.print(j+" ");
                number++;
            }
            j++;

        }
    }
}
