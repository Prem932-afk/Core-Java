public class P14 
{
  public static void main(String[] args) 
  {
     int num = 1234;

     // Step 1: Reverse number to process left-to-right
     int rev = 0;
     int temp = num;
     while (temp > 0)
     {
         rev = rev * 10 + (temp % 10);
         temp = temp / 10;
     }

     // Step 2: Process each digit with its position
     int pos = 1;
     int sumOdd = 0;
     int prodEven = 1;

     while (rev > 0)
     {
         int digit = rev % 10;

         if (pos % 2 == 0)  // even position
             prodEven = prodEven * digit;
         else               // odd position
             sumOdd = sumOdd + digit;

         rev = rev / 10;
         pos++;
     }

     int result = prodEven - sumOdd;
     System.out.println("Result: " + result);
  }
}
