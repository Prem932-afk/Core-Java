
// 9. Multiply first and last digit; add sum of middle digits.  
// Input: 384  
// Output: 26  
// Explanation: 3*4=12 + 8 = 20
class F9 
{
    public static void main(String[] args) 
    {
        int num = 384;
        String str = Integer.toString(num);

        int firstDigit = str.charAt(0) - '0';
        int lastDigit = str.charAt(str.length() - 1) - '0';

        int middleSum = 0;
        for (int i = 1; i < str.length() - 1; i++) 
        {
            middleSum =middleSum + str.charAt(i) - '0';
        }

        int result = (firstDigit * lastDigit) + middleSum;
        System.out.println("Output: " + result);
    }
}
