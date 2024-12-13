import java.util.Scanner;

public class RetailerCustomerDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you Custumer or Retailer");
        String choice=sc.nextLine();
        if(choice.equals("Customer"))
        {
            double finalprice=0;
            System.out.println("Enter your name");
            String name=sc.nextLine();
            System.out.println("Enter your piece");
            double piece=sc.nextDouble();
            if(piece>=1000 && piece <=2000)
            {
               finalprice=piece*0.10;
            }
            else if(piece>2000 && piece <=5000)
            {
                finalprice=piece*0.20;
            }
            else
            {
                System.out.println("No discount");
            }
            System.out.println("Custommer Detail :");
            System.out.println("Name:"+name);
            System.out.println("Piece:"+piece);
            System.out.println("Final price:"+finalprice);

        }
        else if(choice.equals("Retailer"))
        {
            double finalprice=0;
            System.out.println("Enter your name");
            String name=sc.nextLine();
            System.out.println("Enter your piece");
            double piece=sc.nextDouble();
            if(piece>=10 && piece <=20)
            {
               finalprice=piece*0.10;
            }
            else if(piece>20 && piece <=50)
            {
                finalprice=piece*0.20;
            }
            else
            {
                System.out.println("No discount");
            }
            System.out.println("Retailer Detail :");
            System.out.println("Name:"+name);
            System.out.println("Piece:"+piece);
            System.out.println("Final price:"+finalprice);
        }


        // Input Retailer Information
    }
}