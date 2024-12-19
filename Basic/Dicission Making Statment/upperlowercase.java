
import java.util.Scanner;
class upperlowercase{
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your charector");
        ch=sc.next().charAt(0);

        if(ch>='A'&& ch<='Z' )
        {
            System.out.println("Charector is Uper case");
        }
        else
        {
            System.out.println("Charector is lower case");
        }
        sc.close();
    }
}