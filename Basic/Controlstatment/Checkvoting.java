
import java.util.*;
class Checkvoting{
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You can't vote");
        }
    }
}