import java.util.Scanner;
class AlphwateorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your charectorr");
        char ch=sc.next().charAt(0);
        if(ch=='A' && ch=='Z' || ch=='a' && ch=='z')
        {
             System.out.println("Alphawate");
        }
        else
        {
            System.out.println("Not Alphawate");
        }
        sc.close();
    }
}