import java.util.Arrays;

public class P15 
{
    public static void main(String[] args) 
    {
        int num = 3214;

        // Step 1: Convert number to char array
        char digits[] = Integer.toString(num).toCharArray();

        // Step 2: Sort the char array
        Arrays.sort(digits);

        // Step 3: Convert back to integer
        int sortedNum = Integer.parseInt(new String(digits));

        System.out.println("Number with digits sorted ascending: " + sortedNum);
    }
}
