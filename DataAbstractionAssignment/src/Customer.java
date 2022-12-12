import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

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

    Customer(){
        name
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        deposits = new ArrayList<Deposit>;
        withdrawn = new ArrayList<Withdraws>;
        name = name;
        accountNumber = accountNumber;
    }

    public double deposit(double amt, Date date, String account){
        //your code here
        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        return 0;
    }
    private boolean checkOverdraft(double amt, String account){
        if amount < OVERDRAFT {
            return true;
        }
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
