import java.util.Scanner;

class Method4 {
 public static void main(String[] args) {
    new B();
    
 }   
}
class A
{
      int a,b;
       A()
       {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number");
            int a=sc.nextInt();
            int b=sc.nextInt();
            this.a=a;
            this.b=b;
            int mul=a*b;
            System.out.println("mul value :"+mul);
       }
}
class B extends A
{
  
       B()
       {
            int div=a/b;
            System.out.println("divide value :"+div);
       }
}
// A 
// 	default constructor :two number multiplication :user input 

// B 
// 	default constructor :two number divide :user input 
// access child through