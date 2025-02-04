
// class 
// 	static variable 
// 	static block :inside access non-static variable 




class A{
    static int a = 45;
    static {
        System.out.println(a);
    }
}
public class Program7 {
    public static void main(String[] args) {
        new A();
    }
}
