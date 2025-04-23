package Exercises_Mukundi;

public class Exercise4 {
    public static void main(String[] args){
        int i = 1;
        int c = 0;

        while (c<10){
            if(i % 2 != 0){
                System.out.println(i);
                c++;
            }
            i++;
        }
    }
}
