/*
heirarichal inheritance : 
A 
	method1 :no return and no argument  

B 
	method2: return and no argument  


C
	method3: return and  argument  


D
	method4:no return and  argument  


E 
	method5 :covariant 
	*/

 class A1
 {
    public static void main(String[] args) 
    {
         D d = new D();
          d.method1();
          d.metho2();
          d.method3(6);
          d.method4();
    }
 }  
 
 class A
 {
    void method1()
    {
        System.out.println("No return and no Argumetn : Method");
    }
 }

 class B extends A
 {
     int metho2()
     {
        int n=10;
        System.out.println(n);
        return n;
     }
 }

 class C extends B
 {
      int method3(int n)
      {
        System.out.println(n);
        return n;
      }
 }

 class D extends C
 {
     D method4()
     {
        System.out.println("Covarient data types");
        return this;
     }   
 }