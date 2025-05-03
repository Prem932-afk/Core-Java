//Q.2
// A class 
// 	string 

// B class
// 	covariant return type 
// 	welcome to india 
	
class A2
{
    public static void main(String[] args) 
    {
       A a = new A();
        a.mehtod1("Prem");
        a.method2();  
    }
}
class A
{
     String mehtod1(String name)
     {
       System.out.println(name);
       return name;
     }

     A method2()
     {
        System.out.println("Welcome to india");
        return this;
     }
}