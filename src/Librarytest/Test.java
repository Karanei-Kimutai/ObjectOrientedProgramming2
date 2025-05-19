package Librarytest;
import Libraries.Libraries;
import sampleLibraryPackage.sampleLibraryClass;


public class Test {
    public static void randomMethod(String name){
        Libraries.displayName(name);
    }
    public static void main(String[] args){
        sampleLibraryClass.displayName("Karanei");
        randomMethod("Karanei");
    }

}
