import java.util.Scanner;
class Negativepositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number :");
        int n=sc.nextInt();

      if(n<0)
      {
       System.out.println("Number is negative");
      }
      else if(n==0)
      {
        System.out.println("Number is Zero");
      }
      else if(n>0)
      {
       System.out.println("Number is positive");
      }
     sc.close();
    }
}
