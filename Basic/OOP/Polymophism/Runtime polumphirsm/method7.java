public class method7 {
    

    
  
        public static void main(String[] args) {
           c c=new c();
           c.method();
         
        }
       }
       class A
       {
           void method(int a, int b)
           {
               System.out.println("first method");
           }
       }
       class B extends A
       {
           void method(int a)
           {
            System.out.println("second method");
           }
       }
       class c extends B
       {
           void method()
           {
            System.out.println("third method");
           }
       }
   