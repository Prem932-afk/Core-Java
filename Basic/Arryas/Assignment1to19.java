public class Assignment1to19 
{
           public static void main(String[] args) 
           {
            
            int[] array = {123, 567, 453, 678, 876};
            
          
     
            
            for (int num : array) 
            {
                if (num % 2 == 0) 
                {
                    int sumOfDigits = 0;
                    int temp = num;
                    
                    // Calculate the sum of digits of the even number
                    while (temp > 0) 
                    {
                        sumOfDigits = sumOfDigits + temp % 10;
                        temp =temp / 10;
                    }
                    
                   
                    System.out.println(num + "\t\t" + sumOfDigits);
                }
            }
        }
    
    
}
