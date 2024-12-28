import java.util.Scanner;

public class StudentGradeCalculator 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input marks for the five subjects
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Biology: ");
        double biology = scanner.nextDouble();

        System.out.print("Enter marks for Mathematics: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter marks for Computer: ");
        double computer = scanner.nextDouble();

        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500) * 100;

        // Output the percentage
        System.out.println("Total Marks: " + totalMarks + " / 500");
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade based on the percentage
        char grade;

        if (percentage >= 90) 
        {
            grade = 'A';
        } 
        else if (percentage >= 80) 
        {
            grade = 'B';
        } 
        else if (percentage >= 70) 
        {
            grade = 'C';
        } 
        else if (percentage >= 60) 
        {
            grade = 'D';
        } 
        else if (percentage >= 40) 
        {
            grade = 'E';
        } 
        else 
        {
            grade = 'F';
        }

        // Output the grade
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
