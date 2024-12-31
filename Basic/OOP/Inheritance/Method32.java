
class BankAccount 
{
    double balance;

    
    void bankAccount(double balance) 
    {
        this.balance = balance;
    }

   
     void displayBalance()
      {
        System.out.println("Account Balance: $" + balance);
        System.out.println("Interest calculation for a generic bank account is not defined.");
      }

   
}


class SavingsAccount extends BankAccount 
{
    double annualInterestRate;

   
    void savingsAccount(double annualInterestRate) 
    {
        double interest = balance * (annualInterestRate / 100);
        this.annualInterestRate = annualInterestRate;
        System.out.println("Interest for Savings Account: $" + interest);
        System.out.println("Annual Interest Rate for Savings Account: " + annualInterestRate + "%");
    }

  
}


class CheckingAccount extends SavingsAccount 
{
    double monthlyFee;

   
    void checkingAccount(double monthlyFee)
     {
        double interest = balance * (annualInterestRate / 100) - monthlyFee;
        if (interest < 0) {
            interest = 0; // Avoid negative interest
        }
        System.out.println("Interest for Checking Account after monthly fee: $" + interest);
        System.out.println("Monthly Fee for Checking Account: $" + monthlyFee);
        this.monthlyFee = monthlyFee;
    }

   
}

// Main Class to test the inheritance and interest calculations
 class Method32 
 {
    public static void main(String[] args) 
    {
       CheckingAccount c=new CheckingAccount();
       c.checkingAccount(20000);
       c.savingsAccount(20);
       c.bankAccount(10000);
       c.displayBalance();
    }
}
