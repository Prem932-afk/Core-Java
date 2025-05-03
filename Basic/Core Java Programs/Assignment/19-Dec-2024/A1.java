//Q.1
// A :
// 	primtiive data type 
	
class A1
{
    public static void main(String args[])
    {
          A a = new A();
           a.method1(4);
           a.method2(4.4f);

    }
}

class A
{
    int method1(int n)
    {
       System.out.println(n);
       return n;
    }

    float method2(float f)
    {
        System.out.println(f);
        return f;
    }
}