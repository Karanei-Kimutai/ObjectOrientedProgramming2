package InputandOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       // Scanner inputscanner = new Scanner(System.in);
        /*
        for(int i=0;i<3;i++) {
            //output
            System.out.println("Enter your name here:");
            //store the input
            String name = inputscanner.nextLine();

            System.out.println("Enter your age here:");
            int age = inputscanner.nextInt();
            inputscanner.nextLine();
            //output the data
            System.out.println("Your name is:" + name);
            System.out.println("You are " + age + " years old.");
        }
         */
        /*
        String[] names=new String[3];
        int[] ages=new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter your name here:");
            names[i]=inputscanner.nextLine();
            System.out.println("Enter your age here:");
            ages[i]=inputscanner.nextInt();
            inputscanner.nextLine();
        }
        System.out.println("Name\t\t\tAge");
        for( int j=0;j<3;j++){
            System.out.println(names[j]+"\t\t"+ages[j]);
        }
         */
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
