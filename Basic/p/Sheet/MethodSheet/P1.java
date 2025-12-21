//1. Split number into two parts; return sum of their squares.  
// Input: 12345  
// Output: 17154  
// Explanation: Split 123 and 45 → 123² + 45² = 15129 + 2025

class P1
{
    public static void main(String[] args) 
    {
        int number=12345;
        
        //1. Number convert into string 

        String str=Integer.toString(number);

        //2.split number into 2 part

        String part1=str.substring(0,3);
        String part2=str.substring(3);

        //3.convert into number

        int num1=Integer.parseInt(part1);
        int num2=Integer.parseInt(part2);

        //4.Square  and add number 

        int result=(num1 * num1) + (num2 * num2);

        //5. result 

        System.out.println(result);
    }
}