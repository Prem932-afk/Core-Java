import java.util.Scanner;
public class VowelContanat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your charector :");
        char ch=sc.next().charAt(0);
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("Chrector is vowel");
        }
        else
        {
            System.out.println("Charector is consonent ");
        }
        sc.close();
    }
}
