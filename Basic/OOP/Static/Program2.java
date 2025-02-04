
// class 
// 	static class 
// 		method :static :covariant return type 
// 		method :return and argument  

// access 


class A{
    static class B
    {
        static B show()
        {
            System.out.println("Hello");

            return new B();
        }
    }
}
public class Program2 {
   public static void main(String[] args) {
    A.B.show();
   } 
}

