package StringProcessing;

public class stringsclass {
    public static void main(String[] args){
        //Strings are objects of the String class, they can be created in two ways, using constructors or the shorthand method
        String name="Karanei";
        String name2=new String("Kimutai");

        //Strings are immutable: Once a string object is created it cannot be changed, assigning a variable to another String object doesn't delete the initial object
        name="Michael"; //The "Karanei" object still exists, the name variable just points to a different memory address
        System.out.println(name);

        //Strings are objects and thus have methods
        String example="Strathmore";
        System.out.println(example.length());
        System.out.println(example.substring(0,6));
        System.out.println(example.indexOf("more"));
        System.out.println(example.charAt(0));
        System.out.println(example.isEmpty());
        System.out.println(example.toLowerCase());
        System.out.println(example.equals(name));
        System.out.println(example.replace("Strath","5thrath"));//Replacing parts of a string

        //String Concatenation: Strings can be joined together using the + operator
        System.out.println(name+" "+name2);

    }

}
