package FirstPackage;
import java.util.Scanner;
class TempAccount
{
    private double balance = 0;
    private final String AccountNumber = "9918121574";
    public void setBalance(double balance)
    {
        System.out.println("To deposit please enter your account number : ");
        String AccountNumber;
        Scanner sc = new Scanner(System.in);
        AccountNumber = sc.nextLine();
        if (this.AccountNumber.equals(AccountNumber))
        {
            this.balance += balance;
            System.out.println("Balance updated successfully...");
        }
        else
            System.out.println("Account Number not found.....");
    }
    public double getBalance()
    {
        System.out.println("To view balance enter your account number: ");
        String AccountNumber;
        Scanner sc = new Scanner(System.in);
        AccountNumber = sc.nextLine();
        if (this.AccountNumber.equals(AccountNumber))
        {
            return balance;
        }
        else
            System.out.println("Account Number not found.....");
        return 0;
    }
}
public class Account extends TempAccount{
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setBalance(1200.00);
        System.out.println("balance is "+obj.getBalance());
    }
}