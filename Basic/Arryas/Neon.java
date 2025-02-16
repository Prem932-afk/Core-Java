public class Neon 
{
    public static void main(String[] args) 
    {
        
        int[] array = {9, 45, 10, 81, 5};
        
       
        System.out.println("Original Value\tIs Neon?");
        
        for (int num : array) 
        {
            int square = num * num;
            int sumOfDigits = 0;
            
    
            while (square > 0) 
            {
                sumOfDigits += square % 10;
                square /= 10;
            }
            
         
            if (sumOfDigits == num) 
            {
                System.out.println(num + "\t\tYes");
            }
          else
            {
                System.out.println(num + "\t\tNo");
            }
        }
    }
}
