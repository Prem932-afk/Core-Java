// 4. Return number formed by concatenating squares of each digit.  
// Input: 123  
// Output: 149  
// Explanation: 1²=1, 2²=4, 3²=9 → "149"
class P4 
{
    public static void main(String[] args) 
    {
        int num = 123;
        String result = "";

        while (num > 0) 
        {
            int digit = num % 10;
            int square = digit * digit;
            result = square + result; // prepend to keep order correct
            num = num / 10;
        }

        int finalResult = Integer.parseInt(result);
        System.out.println(finalResult); // Output: 149
    }
}
