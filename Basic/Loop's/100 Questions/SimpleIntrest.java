import java.util.Scanner;
class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your principle amount :");
        double amount=sc.nextDouble();
        System.out.println("Eneter the time in year ");
        double time=sc.nextDouble();
        System.out.println("Enter the intresst");
        double rate=sc.nextDouble();

        double SimpleIntrest=(amount*time*rate)/100;
        System.out.println("Your simple intrest value :"+SimpleIntrest);
        sc.close();
        
    }
}

