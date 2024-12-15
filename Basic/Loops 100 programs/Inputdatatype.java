import java.util.Scanner;
class Inputdatatype {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer datatype");
        int n=sc.nextInt();
        System.out.println("Enter double datatype");
        double d=sc.nextDouble();
        System.out.println("Enter char datatype");
        char c=sc.next().charAt(0);
        System.out.println("Enter floating datatype");
        float f=sc.nextFloat();
        System.out.println("Enter string datatype");
        String s=sc.nextLine();
    }
    
}
