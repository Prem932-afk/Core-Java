public class method6 {
    

    
  
        public static void main(String[] args) {
           c c=new c();
           c.method();
         
        }
       }
       class A
       {
           void method()
           {
               System.out.println("first method");
           }
       }
       class B extends A
       {
           void method()
           {
            System.out.println("second method");
           }
       }
       class c extends B
       {
           void method()
           {
            super.method();
            System.out.println("third method");
           }
       }
   