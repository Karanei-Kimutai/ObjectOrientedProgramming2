//Write a method that takes 3 as a parameter and finds the tenth term in the series 3,5,7...
//Write a method that receives an array of integers as an argument and lists all even numbers in that array


package Exercises;

public class Exercise7 {
    public int getTenthTerm(int startingTerm) {
        for (int i = 1; i <= 10; i++) {
            startingTerm+=2;
        }
        return startingTerm;
    }
    public void evenNumbersInArray(int[] array){
        for(int i=0;i< array.length-1;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Exercise7 object=new Exercise7();
       System.out.println(object.getTenthTerm(3));
       object.evenNumbersInArray(new int[]{1,2,3,4,5,6,7});
    }
}
