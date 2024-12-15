import java.util.Scanner;
class Calculater 
{
  public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Calculator on || chose anyone !");
    System.out.println("Additon");
    System.out.println("Substraction");
    System.out.println("Multiplication");
    System.out.println("Divison");
    String ch=sc.nextLine();
    if(ch.equals("Addition"))
    {

        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int add=a+b;
        System.out.println("Addition number :"+ add);
    }
    else if(ch.equals("Additon"))
    {
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int sub=a+b;
        System.out.println("Substraction number :" + sub);

    }
    else if(ch.equals("Multiplication"))
    {
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int mul=a*b;
        System.out.println("Multiplication number :" + mul);

    }
    else if(ch.equals("Divison"))
    {
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int div=a+b;
        System.out.println("Divison number :" +  div);

    }
    else
    {
        System.out.println("Input not match sorry !!");
    }
               
    
   
  }  
}
