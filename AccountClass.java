import java.util.Date;
class Account{
    private int id;
    private double balance, annualInterestRate;

    private Date dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return (balance * 1 * annualInterestRate)/(100 * 12);
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

}

public class AccountClass {
    public static void main(String[] args){
        Account acc = new Account();
        acc.setId(1122);
        acc.setBalance(20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
    
        System.out.println("Balance : " + acc.getBalance());
        System.out.println("Monthly Interest : " + acc.getMonthlyInterest());
        System.out.println("Date Created : " + acc.getDateCreated());
    }

    
}
