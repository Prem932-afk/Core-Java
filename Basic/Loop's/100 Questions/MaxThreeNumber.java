import java.util.Scanner;
class MaxThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ther frist Number :");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b=sc.nextInt();
        System.out.println("Enter the Third Number :");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("First Number is Maximum");
        }
        else if(b>a && b>c)
        {
            System.out.println("Second Number is Maxium");
        }
        else
        {
            System.out.println("Third Number is Maximum");
        }
        sc.close();
        
    }
}