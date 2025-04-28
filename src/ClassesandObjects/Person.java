package ClassesandObjects;

public class Person {
    //Attributes
    private String name;
    private int ID;

    //Constructor
    //Constructors are fundamental in creating objects and are used to initialize attributes
    public Person(String name,int ID){
        this.name=name;
        this.ID=ID;
    }

    //Set and Get methods
    public void setName(String name){
        this.name=name;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }

    //Other methods
    public void showdetails(){
        System.out.println("Name:"+getName());
        System.out.println("ID:"+getID());
    }
}
