import java.util.Scanner;
class Squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        double m=Math.sqrt(n);
        System.out.println(n+"  is  " +m);
    }
}
