import java.util.Scanner;
class checkalphawateornot
{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choise");
    char ch;
    ch=sc.next().charAt(0);
    if(ch=='a')
    {
        System.out.println("This is Alphwate");
        char c;
        c=sc.next().charAt(0);
        if(c=='A' && c=='Z')
        {
            System.out.println("Your Alphawate :"+c);
        }
        else
        {
            System.out.println("Input not matched");
        }
    }
    else if(ch=='D')
    {
        
        System.out.println("This is Digit");
        System.out.println("Enter your digit number");
        int d;
        d=sc.nextInt();
        System.out.println("Your digit number"+d);
    }
    else
    {
        System.out.println("Input not matched");
    }
 }
}
