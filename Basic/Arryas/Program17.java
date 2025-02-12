import java.util.*;
public class Program17 
{
    public static void main(String[] args) 
    {
         int vowel=0;
         int consonent=0;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter your size");
        int size=sc.nextInt();
        char ch[]=new char[size];
        for(int i=0; i<size; i++)
        {
                ch[i]=sc.next().charAt(i);
        }
        for(int i=0; i<size; i++)
        {
              char c=ch[i];
               if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
               {
                  vowel++;
               }
               else
               {
                  consonent++;
               }
               System.out.println("Vowel"+vowel);
               System.out.println("Consonent"+consonent);
        }
    }
}
