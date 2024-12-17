import java.util.Scanner;
class equantletriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your height");
        int height=sc.nextInt();
        System.out.print("Enter your base");
        int base=sc.nextInt();
        int area=1/2*base*height;
        System.out.println("Trainle area :"+area);
    }
}
