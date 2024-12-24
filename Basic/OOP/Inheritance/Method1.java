class Method1
{
    public static void main(String[] args) {
        A a=new A();
        a.show();;
        a.show2("Show2");
        B b=new B();
        b.show3();
        b.show4("Show4");
        
    }
}
class A
{
          void show()
          {
            System.out.println("Show");
          }
          void show2(String name)
          {
            name=name;
            System.out.println(name);
            
          }
}
class B
{
        String show3()
        {
              String name="Show3";
              System.out.println(name);
              return name;
              

        }
        String show4(String name)
        {
            System.out.println(name);
            return name;

        }
}

// single level inheritance :
// A 
// 	method1 :no return and no argument 
// 	method2:no return and  argument 


// B 
// 	method3: return and no argument 

// 	method4: return and  argument 

// access child through :A child class 