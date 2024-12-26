class A
{
    int add(int a, int b)
    {
        return a+b;
    }
    float sub(int a, int b)
    {
        return a-b;
    }
    double mul(int a, int b)
    {
        return a*b;
    }
    int div(int a, int b)
    {
        return a/b;
    }
    int mod(int a, int b)
    {
        return a%b;
    }
    
}
class Method3
{
    public static void main(String[] args) 
    {
           A a=new A();
           System.out.println("Adition :"+a.add(2, 3));    
           System.out.println("Substraction :"+a.sub(2, 3));    
           System.out.println("Mulitplication :"+a.mul(2, 3));    
           System.out.println("Divison :"+a.div(2, 3));    
           System.out.println("Module :"+a.mod(2, 3));    
    }
}