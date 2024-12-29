public class PrintAlphabets 
{
    public static void main(String[] args) 
    {
        // Initialize the counter variable to the ASCII value of 'a'
        char ch = 'a';

        // Use a while loop to print alphabets from 'a' to 'z'
        while (ch <= 'z') 
        {
            System.out.print(ch + " ");
            ch++;  // Move to the next character
        }
    }
}

