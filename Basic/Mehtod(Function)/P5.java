p// 5. Sum of cubes of digits.  
// Input: 153  
// Output: 153  
// Explanation: 1³+5³+3³=153

class F5 
{
    public static void main(String[] args) 
    {
        int num = 153;
        int sum = 0;
        int temp = num;

        while (temp > 0) 
        {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        System.out.println(sum);  // Output: 153
    }
}
