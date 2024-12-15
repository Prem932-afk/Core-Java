import java.util.Scanner;
class Perfect
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
              if(n%i==0)
              {
                sum=sum+i;
              }
              System.out.println(sum);
        }
        if(sum==n)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number not perfec");
        }
    }
}