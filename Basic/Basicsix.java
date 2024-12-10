import java.util.Scanner;
class Basicsix
{
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        a=sc.nextInt();
        System.out.println("Enter your second number");
        b=sc.nextInt();
        float c=a-b;
        System.out.println(c);
    }
}