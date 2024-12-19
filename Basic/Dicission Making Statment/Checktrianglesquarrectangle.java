import java.util.Scanner;
class Checktrianglesquarrectangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choise");
        String name=sc.nextLine();
        if(name.equals("triangle"))
        {
              int base,height;
              System.out.println("Enter your base");
              base=sc.nextInt();
              System.out.println("Enter your height");
              height=sc.nextInt();
              int area=base*height;
              System.out.println("Your triangle"+ area);

        }
        else if(name.equals("reactangle"))
        {
              int length,width;
              System.out.println("Enter your length");
              length=sc.nextInt();
              System.out.println("Enter your width");
              width=sc.nextInt();
              int area=length*width;
              System.out.println("Your reactangle"+ area);
        }
        else if(name.equals(""))
        {
              int side;
              System.out.println("Enter your side");
              side=sc.nextInt();
              int area=side*side;
              System.out.println("Your Square"+ area);
        }
        else
        {
            System.out.println("Input not matched");
        }
        sc.close();
    }
}