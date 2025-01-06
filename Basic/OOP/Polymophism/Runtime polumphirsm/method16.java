public class method16 {
    
    
  
    public static void main(String[] args) {
      new c(33);
    }
   }
   class A
   {
       A(int a)

       {
           System.out.println("A :"+a);
       }
   }
   class B extends A
   {
       B(int b)
       {
        super(11);
        System.out.println("B : "+b);
       }
   }
   class c extends A
   {
       c(int c)
       {
        super(21);
        System.out.println("C : "+c);
       }
   }
