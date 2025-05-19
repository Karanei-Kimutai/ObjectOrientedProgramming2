package Libraries;

/*
Libraries are collections of pre-written classes, interfaces and methods that provide reusable code for common programming tasks
Libraries offer solutions for tasks like file handling, data structures, networking, graphics, database connections etc
Types of libraries:Standard libraries and External libraries
Standard libraries: built-in libraries that come with java eg java.lang, java.util, java.io, java.nio, java.sql, javax.swing, java.time, java.security etc
External Libraries: custom libraries made by others that can be used to bring in extended functionality
*/
/*
How to create your own library
If you want to share the library externally:
Create a new project and write the reusable classes, interfaces and methods
Package it as a .jar using Artifacts(in IntelliJ)
Import the .jar file in other projects: Add the library to the project structure of the project you want to use it in

If you want to create a library to use in a specific project:
Create a package for your library code
Write the classes, interfaces and methods you want to reuse
Use the package as a library in other parts of your project
*/

public class Libraries {
    public static void displayName(String name){
        System.out.println(name);
    }


}
