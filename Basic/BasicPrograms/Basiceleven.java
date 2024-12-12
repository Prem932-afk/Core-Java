
import java.util.Scanner;

class Basiceleven {
    public static void main(String args[]) {
        float a;
        float b;
        float c;
        float d;
        float e;
        float f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        a = sc.nextFloat();
        System.out.println("Enter your second number");
        b = sc.nextFloat();
        System.out.println("Enter your third number");
        c = sc.nextFloat();
        System.out.println("Enter your fourth number");
        d = sc.nextFloat();
        System.out.println("Enter your fivth number");
        e = sc.nextFloat();
        System.out.println("Enter your six number");
        f = sc.nextFloat();
        float g = a * (b - c) / d + e - f;
        System.out.println(g);
    }
}
// 1.6*(12-2)/2+7.8-1.5
