//7. Return difference between sum of digits at odd and even positions (1-based from right).  
// Input: 123456  
// Output: 3  
// Explanation: Odd pos digits sum=9 (1+3+5), Even pos sum=12 (2+4+6); 12-9=3
public class P7 
{
    public static void main(String[] args) 
    {
        int num = 123456;
        int digit = 0;
        int pos = 1;  // position counter (1-based from right)
        int oddSum = 0;
        int evenSum = 0;

        while (num > 0) 
        {
            digit = num % 10;   // get last digit
            if (pos % 2 == 0) 
            {
                evenSum += digit;   // even position
            } 
            else 
            {
                oddSum += digit;    // odd position
            }
            num = num / 10;   // remove last digit
            pos++;            // move to next position
        }

        int result = evenSum - oddSum;
        System.out.println(result);
    }
}
