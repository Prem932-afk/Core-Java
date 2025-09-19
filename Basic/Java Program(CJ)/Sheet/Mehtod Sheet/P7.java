// 7. Return difference between sum of digits at odd and even positions (1-based from right).  
// Input: 123456  
// Output: 3  
// Explanation: Odd pos digits sum=9 (1+3+5), Even pos sum=12 (2+4+6); 12-9=3
class P7 
{
    public static void main(String[] args) 
    {
        int num = 123456;
        int oddSum = 0;
        int evenSum = 0;
        int position = 1;

        while (num > 0) 
        {
            int digit = num % 10;

            if (position % 2 == 0) 
            {
                evenSum += digit;
            } 
            else 
            {
                oddSum += digit;
            }

            num /= 10;
            position++;
        }

        int result = Math.abs(evenSum - oddSum);
        System.out.println("Result : " + result);
    }
}

