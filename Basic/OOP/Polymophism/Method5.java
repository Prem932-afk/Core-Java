public class Method5 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.A(4, 5));
        System.out.println(a.A(5, 5));
        System.out.println(a.A(5, 9));
    }
}

class A {
    
    
        int A(int a, int b) 
        {
            return a + b;
        }
        double A(int a, double b) 
        {
            return a / b;
        }
        double A(double a, int b)
        {
            return a*b;
        }
       
}