import java.util.*;
class malefemalcheck 
{
    public static void main(String[] args) {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your charector");
    ch=sc.next().charAt(0);
    if(ch=='m')
    {
        System.out.println(" Male");
    }
    else
    {
        System.out.println("Female");
    }
    sc.close();

    }
    
}
