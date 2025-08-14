// 6. Reverse number; return sum of digits of reversed number.
// Input: 1234
// Output: 10

class P6 
{
    public static void main(String[] args) 
    {
        int num = 1234;
        int reversed = 0;

        // Step 1: Reverse the number
        int temp = num;
        while (temp > 0) 
        {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        // Step 2: Sum digits of the reversed number
        int sum = 0;
        temp = reversed;
        while (temp > 0) 
        {
            sum += temp % 10;
            temp = temp / 10;
        }

        System.out.println("Output: " + sum); // Output: 10
    }
}
