
// class 
// 	static variable 
// 	static method

// access



class A{
    static int a = 200;
    static void show(){
        System.out.println(a);
        System.out.println("Hello");
    }
}
public class Program12 {
    public static void main(String[] args) {
        A.show();
        // A.a;
    }
}

