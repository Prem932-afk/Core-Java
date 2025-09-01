// 9. Multiply first and last digit; add sum of middle digits.  
// Input: 384  
// Output: 26  
// Explanation: 3*4=12 + 8 = 20

public class P9 
{
    public static void main(String[] args) 
    {
        int num = 384;
        int last = num % 10;          // last digit
        int first = num;              
        while (first >= 10) 
        {         // loop to find first digit
            first = first / 10;
        }

        int middle = num / 10;        // remove last digit → 38
        middle = middle % 10;         // take only middle digits → 8

        int result = (first * last) + middle;
        System.out.println(result);
    }
}
