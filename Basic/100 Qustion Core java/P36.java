
import java.util.Scanner;

public class P36
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the cost price (CP) and selling price (SP)
        System.out.print("Enter the cost price (CP) of the item: ");
        double costPrice = scanner.nextDouble();
        
        System.out.print("Enter the selling price (SP) of the item: ");
        double sellingPrice = scanner.nextDouble();

        // Calculate profit or loss
        if (sellingPrice > costPrice) 
        {
            // Profit case
            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit / costPrice) * 100;
            System.out.println("You made a profit of: " + profit);
            System.out.println("Profit Percentage: " + profitPercentage + "%");
        } 
        else if (sellingPrice < costPrice) 
        {
            // Loss case
            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;
            System.out.println("You incurred a loss of: " + loss);
            System.out.println("Loss Percentage: " + lossPercentage + "%");
        } 
        else 
        {
            // No profit, no loss case
            System.out.println("There is no profit or loss. The selling price equals the cost price.");
        }

        // Close the scanner
        scanner.close();
    }
}
