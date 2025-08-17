class M3 
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
