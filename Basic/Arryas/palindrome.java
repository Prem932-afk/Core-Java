public class palindrome
{
    public static void main(String[] args) 
    {
       
        int[] array = {121, 567, 453, 676, 876}; 
       
        for (int i = 0; i < array.length; i++) 
        {
            int number = array[i];
            int reversed = 0;
            int original = number;
            
      
            while (number > 0)
             {
                int digit = number % 10;   
                reversed = reversed * 10 + digit; 
                number /= 10;   
            }
            
            // Check if the number is a palindrome
            if (original == reversed) 
            {
                System.out.println(original + "\t\tYes");
            } 
            else 
            {
                System.out.println(original + "\t\tNo");
            }
        }
    }
}
