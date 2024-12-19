import java.util.Scanner;
public class Dataypeinput
{
    public static void main(String[] args)
     {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter int value :");
    int i=sc.nextInt();

    System.out.println("Enter float value :");
    float f=sc.nextFloat();

    System.out.println("Enter char value :");
    char c=sc.next().charAt(0);

    System.out.println("Enter double value :");
    double d=sc.nextDouble();

    System.out.println("Enter boolena value :");
    boolean b=sc.nextBoolean();

    System.out.println("Enter long valye :");
    long l=sc.nextLong();
     }


}
