package ExceptionHandling;
//Exceptions are errors that arise during the execution of a program that disrupt the normal flow of instructions, they cause programs to crash if not handled
/*Examples of exceptions
  -Dividing by zero
  -Accessing an invalid index in an array
  -input mismatch
  -trying to open a file that does not exist*/

import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    //There are three types of exceptions, checked and unchecked exceptions
    //Checked exceptions-these are exceptions that must be handled during compile time, the compiler will give an error if you don't handle or declare them using try-catch or throws
    //Checked exceptions are external errors eg. File I/O, database connections
    //Examples include: IOException, SQLException, ClassNotFoundException
    public static void readFile(String filename){
        try{
            FileReader file=new FileReader(filename);
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
    //Unchecked exceptions-these are exceptions that are not checked at compile time, they occur during the execution of a program
    //They are usually caused by programming mistakes
    public static void getStringLength(String string){
        System.out.println("The length of this string is: "+string.length());
    }
    public static void main(String[] args) {
        readFile("Karanei.txt");
        String name=null;
        getStringLength(name); //entering a null string will throw an exception
    }
    //Errors-These are serious problems that applications should not try to handle
    //Errors are mostly caused by JVM/internal problems
    //They cannot be and should not be handled using try catch blocks
    //Example:OutOfMemoryError, StackOverflowError, VirtualMachineError
}
