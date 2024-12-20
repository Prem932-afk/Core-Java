import java.util.Scanner;
class areaoftriangl 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of triangle");
        int height=sc.nextInt();
        System.out.println("Enter the length of trianlg");
        int length=sc.nextInt();
        double area=0.5*height*length;
        System.out.println("Area of triangle :"+area);
        sc.close();
}
}