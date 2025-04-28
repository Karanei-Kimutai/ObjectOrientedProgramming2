package InheritanceandPolymorphism;

public class Person {
    //Attributes
    private String name;
    private int ID;

    //Constructor
    public Person(String name,int ID){
        this.name=name;
        this.ID=ID;
    }

    //Get and Set methods
    public void setID(int ID){
        this.ID=ID;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }

    public void showdetails(){
        System.out.println("Name: "+getName());
        System.out.println("ID: "+getID());
    }
}
