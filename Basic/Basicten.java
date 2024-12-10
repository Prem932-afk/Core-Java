
import java.util.Scanner;
class Basicten
{
    public static void main(String args[])
    {
        float a;
        float b;
        float c;
        float d;
        float e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        a=sc.nextFloat();
        System.out.println("Enter your second number");
        b=sc.nextFloat();
        System.out.println("Enter your third number");
        c=sc.nextFloat();
        System.out.println("Enter your fourth number");
        d=sc.nextFloat();
        System.out.println("Enter your fivth number");
        e=sc.nextFloat();
        float f=a*b-c/d;
        System.out.println(f);
    }
}
//1.2*6.7-4.5/2  
