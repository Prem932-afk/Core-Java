//Q.7)
 
//Access Modifiers for Getter and Setter.

//Write a class Account with private fields balance (double) and accountNumber (String). Implement getter and setter methods with 
//public visibility and test them from outside the class.


class P7
{
    public static void main(String[] args) 
    {
        
          Account a=new Account();
            a.setBalance(2334);
            a.setAccountNumber("gahie3535");
            System.out.println(a.getBalance());
            System.out.println(a.getAccountNumber());
    }
}
class Account
{
        private double balance;
        private String accountNumber;

        public void setBalance(double balance)
        {
            this.balance=balance;
        }

        public double getBalance()
        {
            return balance;
        }

        public void setAccountNumber(String accountNumber)
        {
            this.accountNumber=accountNumber;
        }

        public String getAccountNumber()
        {
            return accountNumber;
        }
}