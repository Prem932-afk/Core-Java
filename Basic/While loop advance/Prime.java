import java.util.Scanner;
class Prime
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=1; i<=n;i++)
        {
            if(n%2==0)
            {
              count++;
            }
        }
        if(count==2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not-Prime");
        }
    }
}