//500---->50 number print 
import java.util.Scanner;
class P13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("which table print");
        int n=sc.nextInt();
        int table=0;
        int i = 1; 
        while (i<=10) 
        { 
           table=i*n;
            System.out.println(table);
           
           i++;
        }
    }
}
