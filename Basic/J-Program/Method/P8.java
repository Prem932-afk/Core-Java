
// 8. Return number formed by complement of each digit (9 - digit).  
// Input: 2301  
// Output: 7698

class F8 
{
    public static void main(String[] args) 
    {
        int num = 2301;
        String str = Integer.toString(num);
        String result = "";

        for (int i = 0; i < str.length(); i++) 
        {
            int digit = str.charAt(i) - '0';
            int complement = 9 - digit;
            result =result + complement;
        }

        System.out.println("Output: " + result);
    }
}

