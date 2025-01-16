class Program7 
{
   public static void main(String[] args) 
   {
    Account a=new Account("AC78578585783", 10000);
    System.out.println("Account Number :"+a.getAccountnumber());
    System.out.println("Balance :"+a.getBalance());
   }    
}
class Account
{
   private String accountnumber;
   private double balance;
   
   Account(String accountnumber, double balance)
   {
          this.accountnumber=accountnumber;
          this.balance=balance;
          if(balance >=0)
          {
               this.balance=balance;
               System.out.println("Your Balance :"+this.balance);
          }
          else
          {
               System.out.println("Invalid Balance ");
          }
   }
    String getAccountnumber()
    {
       return accountnumber;
    }

    double getBalance()
    {
        return balance;
    }
   
}
//Access Modifiers for Getter and Setter
//Write a class Account with private fields balance (double) and accountNumber (String). Implement getter and setter methods with public visibility and test them from outside the class.
