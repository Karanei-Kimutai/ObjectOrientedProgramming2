package InheritanceandPolymorphism;

public class Student extends Person{
    private int studentID;

    public Student(String name,int ID,int studentID){
        super(name,ID);
        this.studentID=studentID;
    }

    public void setStudentID(int studentID){
        this.studentID=studentID;
    }
    public int getStudentID(){
        return studentID;
    }

    @Override
    public void showdetails(){
        super.showdetails();
        System.out.println("Student ID: "+getStudentID());
    }
}
