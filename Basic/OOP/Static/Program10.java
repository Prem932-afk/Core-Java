
// class 
// 	four methods :static 

// 	two static block 



class A{
    static void show1(){
        System.out.println("Helllllo");
    }
    static void show2(){
        System.out.println("Hellllo");
    }
    static void show3(){
        System.out.println("Helllo");
    }
    static void show4(){
        System.out.println("Hello");
    }

    static {
        System.out.println("Hii");
    }
    static {
        System.out.println("Hiii");
    }
}
public class Program10 {
    public static void main(String[] args) {
        A.show1();
        A.show2();
        A.show3();
        A.show4();
    }
}

