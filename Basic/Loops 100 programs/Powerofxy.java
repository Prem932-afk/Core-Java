import java.util.Scanner;
class Powerofxy {
    public static void main(String[] args) 
    {
        int result=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int n=sc.nextInt();
    System.out.println("Enter your power");
    int p=sc.nextInt();
    for(int i=1; i<=p;i++)
    {
        result=result*n;
        System.out.println(result);
    }
    }
}
