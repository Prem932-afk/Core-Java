//Q.3
//A :
//	primtiive data type


class A3
{
    public static void main(String[] args) 
    {
         A a = new A();
          a.method1();
          a.method2();
          a.method3();
    }
}

class A
{
    int method1()
    {
        int n=5;
        System.out.println(n);
        return n;
    }

    float method2()
    {
        float f=5.5f;
        System.out.println(f);
        return f;
    }

    char method3()
    {
         char c='A';
         System.out.println(c);
         return c;
    }
}