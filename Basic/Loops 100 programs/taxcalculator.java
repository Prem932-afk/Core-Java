import java.util.Scanner;
class taxcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your salary :");
        int salary=sc.nextInt();
        double tax=0;
        if(salary<=10000)
        {
            System.out.println("No tax :");
        }
        else if(salary>10000 && salary <=100000)
        {
            tax=salary*0.10;
            System.out.println("your salary :"+tax);
        }
        else if(salary>10000 && salary <=300000)
        {
            tax=salary*0.20;
            System.out.println("your salary :"+tax);
        }
        else
        {   
            tax=salary*0.20;
            System.out.println("your salar :"+tax);
        }
        

    }
}
