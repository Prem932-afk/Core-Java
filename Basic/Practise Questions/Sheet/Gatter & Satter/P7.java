//Q.7)
 
//Access Modifiers for Getter and Setter.

//Write a class Account with private fields balance (double) and accountNumber (String). Implement getter and setter methods with 
//public visibility and test them from outside the class.

public class Account 
{
    // Private fields
    private double balance;
    private String accountNumber;

    // Public getter for balance
    public double getBalance() 
    {
        return balance;
    }

    // Public setter for balance
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    // Public getter for accountNumber
    public String getAccountNumber() 
    {
        return accountNumber;
    }

    // Public setter for accountNumber
    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        // Create an Account object
        Account acc = new Account();

        // Set values using setters
        acc.setAccountNumber("ACC123456");
        acc.setBalance(2500.75);

        // Get values using getters
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: $" + acc.getBalance());
    }
}
