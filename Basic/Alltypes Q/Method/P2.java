public class P2
{
   public static void main(String[] args) 
   {
        method m=new method();
         m.add(2, 4);
         m.sub(4, 10);
         m.div(3, 4);
         m.mul(4, 5);
   }    
}
class method
{
    
    void add(int a, int b)
    {
        System.out.println("Addition Number");
        int add=a+b;
        System.out.println(add);
    }

    void sub(int a, int b)
    {
        System.out.println("Substraction Number");
        int sub=a-b;
        System.out.println(sub);
    }

    void mul(int a, int b)
    {
        System.out.println("Multiple Number");
        int mul=a*b;
        System.out.println(mul);
    }

    void div(int a, int b)
    {
        System.out.println("Divide Number");
        int div=a/b;
        System.out.println(div);
    }
}
