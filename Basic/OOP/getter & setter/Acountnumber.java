 class Acountnumber {
   public static void main(String[] args) {
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
