package BankExercise;

public class Main {
    public static void main(String[] args){
        BankApplication user1=new BankApplication("Karanei",216353803,"KARANEI2006");
        user1.setBalance(100000);
        user1.deposit(500000);
        user1.withdraw(50000);
        user1.showAccountDetails();
    }
}
