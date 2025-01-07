public class method10 {
    public static void main(String[] args) {
        A p=new A() 
        {
            int show(int a)
            {
                   System.out.println(a);
                   return a;
            }
        };
        p.show(10);
    }
}
abstract class  A {

    abstract int show(int a);
}
