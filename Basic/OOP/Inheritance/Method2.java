class Method2 {
 public static void main(String[] args) {
    B b=new B();
    b.add(6,7);
    b.sub(34,99);
    
 }    
}
class A
{
    int a,b;
    void add(int a, int b)
    {
        this.a=a;
        this.b=b;
        int add=a+b;
        System.out.println("Adition value :"+ add);
    }
}
class B extends A
{
    
    void sub(int a, int b)
    {
        
        int sub=a-b;
        System.out.println("Substraction  value :"+ sub);
    }
}
// A 
// instance variable 
// method through value passes then two number addition 

// B
// instance variable 
// method through value passes then two number substraction 

// access child through
