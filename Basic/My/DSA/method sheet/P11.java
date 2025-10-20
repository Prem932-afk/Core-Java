public class P11 
{
    public static void main(String[] args) 
    {
        int num = 123;
        int sum = 0;
        
        while(num > 0) 
        {
            int digit = num % 10;
            sum += digit * digit;  // add square of each digit
            num /= 10;
        }
        
        System.out.println("Sum of digits squared: " + sum);
    }
}
