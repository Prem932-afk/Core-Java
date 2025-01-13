import java.util.Scanner;

public class CompoundIntrest16 
{
   public static void main(String[] args) 
   {
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your principle amount :");
        double principle=sc.nextDouble();
        
        System.out.println("Eneter the time in year ");
        double time=sc.nextDouble();
        
        System.out.println("Enter the intresst");
        double rate=sc.nextDouble();

        double amount=principle* Math.pow(1+rate/100,time);
        double CompundIntrest=amount-principle;
        System.out.println("Your Compund intrest (CI) :"+CompundIntrest);
        System.out.println("Total Amount after " + time + " years is: " + amount);
        sc.close();
        
    }
}
//Write a java program to enter P, T, R and calculate Compound Interest ?