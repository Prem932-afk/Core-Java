// Return & Argument

public class P3 
{
     public static void main(String[] args) 
     {
         Demo d= new Demo();
          System.out.println( d.show(20));
     }
}

class Demo
{
   int a;

   int show(int a)
   {
     this.a=a;
     return a;
   }

   void display()
   {
    System.out.println("Return & Argument");
   }
}
