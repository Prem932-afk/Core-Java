import java.util.Scanner;
class swapnumber{
    public static void main(String args[])
    {
        int a=20,b=10;
        System.out.println("Befor swap"+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap"+a+" "+b);
    }
}
