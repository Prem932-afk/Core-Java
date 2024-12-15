import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args) {
        int n=232;
        int rem,sum=0;
        int p=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(p==sum)
		{
            System.out.println("this number is pallindrome ");
        }
        else 
		{
            System.out.println("this number is not pallindrome ");
        }
    }
}