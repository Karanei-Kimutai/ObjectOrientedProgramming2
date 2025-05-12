package ExceptionHandling;
//You can make your own exceptions by extending the Exception class(makes a checked exception) or the RuntimeException class(makes a runtime exception class)
public class CustomExceptions extends Exception{
    public CustomExceptions(String message){
        super(message);
    }
    public static void verifyAge2(int age) throws CustomExceptions {
        if (age < 18) {
            throw new CustomExceptions("Invalid age");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args){
        try{
            verifyAge2(17);
        }catch(CustomExceptions e){
            System.out.println("You are too young to vote");
        }
    }
}
