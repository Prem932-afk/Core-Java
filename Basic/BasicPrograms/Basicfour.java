import java.util.Scanner;
class Basicfour
{
    public static void main(String args[])
    {
        float a;
        float b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        a=sc.nextFloat();
        System.out.println("Enter your second number");
        b=sc.nextFloat();
        float c=a/b;
        System.out.println(c);
    }
}
