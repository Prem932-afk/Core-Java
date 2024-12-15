import java.util.Scanner;
class Reversenumber
{
    public static void main(String[] args) {
        int n=232;
        int rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}