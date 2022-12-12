import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    //Default
    Customer(){
        this.accountNumber += 1;
        this.name = "John Doe";
        this.deposits = new ArrayList<Deposit>();
        this.withdraws = new ArrayList<Withdraw>();
        this.checkBalance = 0.0;
        this.savingBalance = 0.0;
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList<Deposit>();
        withdraws = new ArrayList<Withdraw>();
        this.checkBalance += checkDeposit;
        this.savingBalance += savingDeposit;
    }

    //Requires: double, date, string
    //Modifies: this
    //Effects: Add the amount to the specified account (checking or savings).
    public double deposit(double amt, Date date, String account){
        if(Objects.equals(account, CHECKING)) {
            checkBalance += amt;
            System.out.println("Deposit of: " + amt + "Date: " + new Date() + "into account: " + account + "Current" +
                    "balance in " + account + " is " + checkBalance);
        }
        System.out.println("Deposit of: " + amt + "Date: " + new Date() + "into account: " + account + "Current" +
                "balance in " + account + " is " + savingBalance);
        return 0;
    }

    //Requires: double, date, string
    //Modifies: this
    //Effects: Minuses the amount from the specified account.
    public double withdraw(double amt, Date date, String account){
        //your code here
        return 0;
    }

    //Requires: double, string
    //Effects
    private boolean checkOverdraft(double amt, String account){
        //your code here
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
