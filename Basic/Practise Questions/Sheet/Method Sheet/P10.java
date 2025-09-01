
// 10. Count prime digits in number.  
// Input: 23789  
// Output: 3  
// Explanation: Primes digits are 2,3,7

public class P10 
{
    public static void main(String[] args) 
    {
        int num = 23789;
        int count = 0;

        while (num > 0) 
        {
            int digit = num % 10;  // take last digit
            if (isPrimeDigit(digit)) 
            {
                count++;
            }
            num = num / 10;        // remove last digit
        }

        System.out.println(count);
    }

    // check prime digit
    static boolean isPrimeDigit(int d) 
    {
        return (d == 2 || d == 3 || d == 5 || d == 7);
    }
}
