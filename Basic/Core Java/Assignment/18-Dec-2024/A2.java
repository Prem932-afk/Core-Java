 


// class A:
// 	add()
// 	sub()
// 	div()
// 	multi()

// class B
// 	even()

// class C
// 	odd ()




public class A2 
{
  public static void main(String[] args) 
  {
      A a=new A();
       a.add(1, 2);
  }    
}

class A
{
         void add(int a, int b)
         {
               int c=a+b;
               System.out.println("Addition Value :"+c);
         }

         void sub(int a, int b)
         {
               int c=a-b;
               System.out.println("Substraction Value :"+c);
         }

         void mul(int a, int b)
         {
               int c=a*b;
               System.out.println("Multiple Value :"+c);
         }

         void div(int a, int b)
         {
               int c=a/b;
               System.out.println("Divison Value :"+c); 
         }
}

class B
{
          void Even(int n)
          {
               if(n%2==0)
               {
                System.out.println("Even Number");
               }
          }
}

class C
{
    
         void even(int n)
         {
                if(n%2==0)
                {
                 System.out.println("Even Number");
                } 
         }
}
