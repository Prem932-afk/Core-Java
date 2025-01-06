class method14{
    public static void main(String[] args) {
        new B(21);
    }
}
class A
{
                A(int a)
                {
                   System.out.println("A value :"+a);
                }
}
class B extends A
{
    B(int b)
    {
        super(11);
        System.out.println("B value :"+b);
    }

}