import java.util.Scanner;

public class NoteCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input amount from user
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        // Initialize variables to hold the number of notes for each denomination
        int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, one = 0;

        // Calculate the number of notes for each denomination
        if (amount >= 100) {
            hundred = amount / 100;
            amount = amount % 100;
        }
        if (amount >= 50) {
            fifty = amount / 50;
            amount = amount % 50;
        }
        if (amount >= 20) {
            twenty = amount / 20;
            amount = amount % 20;
        }
        if (amount >= 10) {
            ten = amount / 10;
            amount = amount % 10;
        }
        if (amount >= 5) {
            five = amount / 5;
            amount = amount % 5;
        }
        if (amount >= 1) {
            one = amount;
        }

        // Display the result
        System.out.println("Notes required:");
        if (hundred > 0) {
            System.out.println("100 : " + hundred);
        }
        if (fifty > 0) {
            System.out.println("50 : " + fifty);
        }
        if (twenty > 0) {
            System.out.println("20 : " + twenty);
        }
        if (ten > 0) {
            System.out.println("10 : " + ten);
        }
        if (five > 0) {
            System.out.println("5 : " + five);
        }
        if (one > 0) {
            System.out.println("1 : " + one);
        }

        // Close the scanner
        scanner.close();
    }
}
