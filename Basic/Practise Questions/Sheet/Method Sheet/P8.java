// 8. Return number formed by complement of each digit (9 - digit).  
// Input: 2301  
// Output: 7698


public class P8 
{
    public static void main(String[] args) 
    {
        int num = 2301;
        int result = 0;
        int place = 1;   // place value (units, tens, hundreds...)

        while (num > 0) 
        {
            int digit = num % 10;       // get last digit
            int complement = 9 - digit; // find complement
            result = result + (complement * place); // add to result at correct place
            num = num / 10;             // remove last digit
            place = place * 10;         // move to next place value
        }

        System.out.println(result);
    }
}
