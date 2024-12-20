import java.util.Scanner;
class Thirdangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first angle of triangle :");
        double firstangle=sc.nextDouble();
        System.out.println("Enter second angle of triangle");
        double secondangle=sc.nextDouble();
        double thirdangle=180-(firstangle+secondangle);
        if( firstangle <=0 || secondangle <= 0 || firstangle+secondangle >=180 )
        {
            System.out.println("Error: The sum of the two angles must be less than 180 and both angles must be positive."); 
        }
        else
        {
            System.out.println("The third angle of the triangle is: " + thirdangle);
        }
        sc.close();
    }
}
