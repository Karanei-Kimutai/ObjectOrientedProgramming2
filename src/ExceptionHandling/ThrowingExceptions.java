package ExceptionHandling;

public class ThrowingExceptions {
    //When errors occur during the execution of a program, the program throws an exception
    //This can also be done manually
    //You can throw built-in exceptions and custom exceptions
    public static void verifyAge(int age){
        if (age < 18) {
            throw new ArithmeticException();
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    //NB: You manually throw exceptions with the aim of handling them later
    public static void main(String[] args){
        int age=15;
        try {
            verifyAge(age);
        }catch(ArithmeticException e){
            System.out.println("You are too young");
        }

    }
}
