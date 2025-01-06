public class method15 {
    

    
    public static void main(String[] args) {
      new c(35);
     
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
        super(33);
        System.out.println("B :"+b);
       }
   }
   class c extends B
   {
       c(int c)
       {
        super(34);
        System.out.println("C :"+c);
       }
   }
