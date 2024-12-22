import java.util.Scanner;
class Method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your name");
        String name =sc.nextLine();
        new A();
        A p1=new A();
        p1.show();
        p1.stu(age,name);
        p1.mul();
    }
}
class A
{ 
    //Constructure
      int a,b;
      A()
      {
        System.out.println("Constructure : "+a+" "+b);
      }
    //Method

      void show()
      {
        System.out.println("Method");
      }
    //No return & argument

      void stu(int age,String name)
      {
        System.out.println(age+" "+name);
      }
    // return & No argumetn

      int mul()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int c=a*b;
        System.out.println("Value of C :"+c);
        return c;
      }
}
