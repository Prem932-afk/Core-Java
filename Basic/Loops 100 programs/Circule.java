import java.util.Scanner;
class Circule
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double PI=3.14;
        System.out.println("Enter radius :");
        double radius=sc.nextDouble();
        double diameter=2*radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;
        System.out.printf("Diameter: %.2f%n", diameter);
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Area: %.2f%n", area);
    }
}
