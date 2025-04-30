package BankExercise;

public class BankApplication {
    //Attributes
    private String name;
    private int ID;
    private String accountNumber;
    private float balance;


    //Constructor
    public BankApplication(String name, int ID,String accountNumber){
        this.name=name;
        this.ID=ID;
        this.accountNumber=accountNumber;
    }


    //Get and set methods
    public void setBalance(float balance){
        this.balance=balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public float getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getID(){
        return ID;
    }

    public void deposit(float amount){
        setBalance(getBalance()+amount);
    }
    public void withdraw(float amount){
        if (getBalance()<amount){
            System.out.println("Insufficient funds");
        }
        else{
            setBalance(getBalance()-amount);
        }
    }

    public void showAccountDetails(){
        System.out.println("Account Number:"+getAccountNumber());
        System.out.println("Name of account holder:"+getName());
        System.out.println("ID number of account holder:");
        System.out.println("Account balance:"+getBalance());
    }

}
