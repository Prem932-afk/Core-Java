public class Vowel 
{
    public static void main(String[] args) 
    {
       
        char[] array = {'a', 'b', 'c', 'e', 'i', 'o', 'u', 'z'};
        
     
        
        for (char ch : array) 
        {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                System.out.println(ch + "\t\tYes");
            } 
            else 
            {
                System.out.println(ch + "\t\tNo");
            }
        }
    }
}
