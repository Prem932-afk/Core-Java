class method1{
    public static void main(String[] args) {
        D d=new D();
        d.show(3);
        d.show(2,4);
        
    }
}
class A
{
         void show()
         {
            System.out.println("void show");
         }
         
}
class B extends A
{
         void show()
         {
             super.show();
             System.out.println("void show 2");
         }
}
class C extends B
{
     void show(int a,int b)
     {
        System.out.println("void show 3");
     }
}
class D extends C
{
      int show(int a)
      {
        
        return a;
      }
}

//class name different and method name same then method will be overrided 
//class name different and method name same child k through parent method ko call krna hai used super keyword 
//class name different and method name same number of parameter :
//class name different method name same but return type of method changed 