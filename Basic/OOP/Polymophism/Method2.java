class A
{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }

    int sub(int a, int b)
    {
        return a-b;
    }
    int sub(int a,int b,int c)
    {
        return a-b-c;
    }

    int mul(int a, int b)
    {
        return a*b;
    }
    int mul(int a,int b,int c)
    {
        return a*b*c;
    }

    int div(int a, int b)
    {
        return a/b;
    }
    int div(int a,int b,int c)
    {
        return a/b/c;
    }

    int mod(int a, int b)
    {
        return a%b;
    }
    int mod(int a,int b,int c)
    {
        return a/b/c;
    }
    
}
class Method2
{
    public static void main(String[] args) 
    {
           A a=new A();
           System.out.println("Adition :"+a.add(2, 3));    
           System.out.println("Adition :"+a.add(2, 3,5));  

           System.out.println("Adition :"+a.sub(2, 3));    
           System.out.println("Adition :"+a.sub(2, 3,6)); 

           System.out.println("Adition :"+a.mul(2, 3));    
           System.out.println("Adition :"+a.mul(2, 3,6));   

           System.out.println("Adition :"+a.div(2, 3));    
           System.out.println("Adition :"+a.div(2, 3,6));  

           System.out.println("Adition :"+a.mod(2, 3));    
           System.out.println("Adition :"+a.mod(2, 3,6));    
    }
}