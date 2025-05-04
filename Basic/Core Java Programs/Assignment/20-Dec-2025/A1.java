// class A
// 	parameterised constructor :two number addition 

// class B
// 	parameterised constructor :two number subs

// class C
// 	parameterised constructor :two number div

// class D
// 	parameterised constructor :two number multi

class A1
{
     public static void main(String args[])
     {
            new A(9, 3);
            new B(66, 33);
            new C(44,55);
            new D(44,55);
     }
}

class A 
{
    A(int a, int b)
    {
        a=9;
        b=10;
        System.out.println("Additon Number :"+ (a+b));
    }
}


class B 
{
    B(int a, int b)
    {
        a=9;
        b=10;
        System.out.println("Subiton Number :" + (a-b));
    }
}


class C
{
    C(int a, int b)
    {
        a=9;
        b=10;
        System.out.println("Division Number :"+ (a/b));
    }
}

class D 
{
    D(int a, int b)
    {
        a=9;
        b=10;
        System.out.println("Multiple Number :"+ (a*b));
    }
}