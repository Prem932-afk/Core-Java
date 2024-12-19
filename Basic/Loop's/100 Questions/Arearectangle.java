import java.util.Scanner;
class Arearectangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rectangle length :");
        double length=sc.nextDouble();
        System.out.println("Enter rectangle breath :");
        double breath=sc.nextDouble();
        double area=length*breath;
        System.out.println("Rectamge parameter : " + area); 
        sc.close();
        
    }
}
