import java.util.Scanner;

public class AverageValueCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Accept the weight and number of items for both items
        System.out.print("Enter weight of item1: ");
        float weightItem1 = scanner.nextFloat();
        System.out.print("Enter number of item1: ");
        float numItem1 = scanner.nextFloat();

        System.out.print("Enter weight of item2: ");
        float weightItem2 = scanner.nextFloat();
        System.out.print("Enter number of item2: ");
        float numItem2 = scanner.nextFloat();

        // Calculate the total weight of the items
        float totalWeight = (weightItem1 * numItem1) + (weightItem2 * numItem2);

        // Calculate the total number of items purchased
        float totalItems = numItem1 + numItem2;

        // Calculate the average value
        float averageValue = totalWeight / totalItems;

        // Output the average value
        System.out.println("Average Value = " + averageValue);
    }
}



 
// Write a java program that accepts two item’s weight (floating points' values ) and number of purchase (floating points' values) and calculate the average value of the items :

// Test Data :
// Weight - Item1: 15
// No. of item1: 5
// Weight - Item2: 25
// No. of item2: 4
// Expected Output:
// Average Value = 19.444444
