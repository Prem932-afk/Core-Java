import java.util.Scanner;
public class Vowelcount 
{
     public static void main(String[] args) 
     {
         int vowelCount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size");
        int size=sc.nextInt();   

        char ch[]=new char[size];

        for(int i=0; i<size; i++)
        {
            System.out.println("Enter your charector");
            ch[i]=sc.next().charAt(0);
        }
      
        for(int i=0; i<size; i++)
        {
            System.out.println(ch[i]);
        }

        for(int i=0; i<size; i++)
        {
             if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
             {
                vowelCount++;
                System.out.println("Vowel charector is :"+ch[i]);
             }

            
        }
        System.out.println("Total Vowel :"+ vowelCount);
        
    }
}
