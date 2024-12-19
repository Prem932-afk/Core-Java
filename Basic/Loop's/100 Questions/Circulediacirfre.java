import java.util.Scanner;
class Circulediacirfre
    {
        public static void main(String[] args) 
        {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter circule radius :");
             double radius=sc.nextDouble();
             
             double diameter=2*radius;
             double  circumference=2*3.14*radius;
             double area=3.14*radius*radius;

             System.out.println("Circule diameter :"+diameter);
             System.out.println("Circule circmference :"+circumference);
             System.out.println("Circule area :"+area);
        }
    }
