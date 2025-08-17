
// 10. Count prime digits in number.  
// Input: 23789  
// Output: 3  
// Explanation: Primes digits are 2,3,7
class F10 
{
    public static void main(String[] args) 
    {
        int num = 23789;
        String str = Integer.toString(num);

        int count = 0;

        for (int i = 0; i < str.length(); i++) 
        {
            int digit = str.charAt(i) - '0';

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) 
            {
                count++;
            }
        }

        System.out.println("Output: " + count);
    }
}
