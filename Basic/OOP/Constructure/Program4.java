public class Program4 
{
   public static void main(String[] args) 
   {
     A a=new A();
      a.add(3, 4);
      a.sub(4, 5);
      a.mul(6, 7);
      a.div(3,4);
   }    
}
class A
{
    int a;
    int b;

    void add(int x,int y)
    {
          a=x;
          b=y;
          int c=a+b;
          System.out.println("Addition :"+c);
    }

    void sub(int x, int y)
    {
        a=x;
        b=y;
        int c=a-b;
        System.out.println("Substracton :"+c);
    }

    void mul(int x,int y)
    {
          a=x;
          b=y;
          int c=a*b;
          System.out.println("Multiple :"+c);
    }

    void div(int x,int y)
    {
          a=x;
          b=y;
          int c=a/b;
          System.out.println("Divison :"+c);
    }   

}

//user input of instance variable through method and parameter name is also different : 
// add()
// sub()
// div()
// multi() 
// no third variable allow 
