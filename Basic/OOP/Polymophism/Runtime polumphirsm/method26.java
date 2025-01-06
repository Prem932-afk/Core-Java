public class method26 {
    
   
    
        public static void main(String[] args) {
            B b=new B();
            b.antother1();
            b.method2();
           
    }
    }
    class A
    {
        private void method1()
        {
           
           System.out.println("method 1");
        }

        void antother1()
        {
            
               
                method1();//second way
                
        }
    
    }
            
    class B extends A
    {
        
        protected void method2()
        {
           System.out.println("method 2");
        }
       
    
    
    }
    class c extends B
    {

    }
    
    
    
    
    
    
}
