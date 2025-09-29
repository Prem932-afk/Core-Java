//1.  Write a Java program to perform input/output of all basic data types ?
import java.util.Scanner;
class P1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Interger Number");
        int n=sc.nextInt();
        System.out.println("Integer Number :"+n); 
        System.out.println(" ");

        System.out.println("Enter Float Number");
        float f=sc.nextFloat();
        System.out.println("Float Number :"+f); 
        System.out.println(" ");

        System.out.println("Enter Double Number");
        Double d=sc.nextDouble();
        System.out.println("Double Number :"+d); 
        System.out.println(" ");

        System.out.println("Enter Charector ");
        char ch=sc.next().charAt(0);
        System.out.println("Charector Value : "+ch); 
        System.out.println(" ");

        sc.nextLine();

        System.out.println("Enter String name");
        String s=sc.nextLine();
        System.out.println("String Datatype :"+s); 
    }
}
