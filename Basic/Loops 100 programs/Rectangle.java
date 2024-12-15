import java.util.Scanner;
class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Length :");
        int len=sc.nextInt();
        System.out.println("Enter your breadth");
        int bre=sc.nextInt();
        int area=len*bre;
        System.out.println("Your rectangel area is :"+area);
    }
}
