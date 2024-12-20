import java.util.*;
class equilateraltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the side of the equilateral triangle:");
        float side=sc.nextFloat();
        double area= (Math.sqrt(3) / 4) * side * side;
        System.out.println("\"The area of the equilateral triangle is: "+area);
        sc.close();
    }
}
