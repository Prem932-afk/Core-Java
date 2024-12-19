import java.util.Scanner;
class dividenumber
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        n=sc.nextInt();
        if(n%5==0 && n%11==0)
        {
            System.out.println("Number is divisible by 11 and 5");
        }
        else
        {
            System.out.println("Numbe is not divisivle by 11 and 5");
        }
        sc.close();
    }
}