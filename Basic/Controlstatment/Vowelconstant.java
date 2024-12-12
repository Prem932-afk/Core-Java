import java.util.Scanner;
class Vowelconstant{
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your charector");
        ch=sc.next().charAt(0);

        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' )
        {
            System.out.println("Charector is Vowel");
        }
        else
        {
            System.out.println("Charector is consonent");
        }
    }
}