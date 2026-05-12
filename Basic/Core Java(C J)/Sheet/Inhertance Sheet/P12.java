// 12)
// Create a program where a BankAccount class is inherited by a SavingsAccount class, which is then inherited by a CheckingAccount class. Each class should have a different method for calculating interest.

// Multilevel Inheritance Example

class P12
{
    public static void main(String[] args)
    {
        // Creating object of CheckingAccount
        CheckingAccount obj = new CheckingAccount();

        obj.showBalance();

        obj.calculateSavingsInterest();

        obj.calculateCheckingInterest();
    }
}

// Parent Class
class BankAccount
{
    double balance = 50000;

    void showBalance()
    {
        System.out.println("Account Balance : " + balance);
    }
}

// Child Class
class SavingsAccount extends BankAccount
{
    void calculateSavingsInterest()
    {
        double interest = balance * 0.05;

        System.out.println("Savings Account Interest : " + interest);
    }
}

// Grandchild Class
class CheckingAccount extends SavingsAccount
{
    void calculateCheckingInterest()
    {
        double interest = balance * 0.02;

        System.out.println("Checking Account Interest : " + interest);
    }
}