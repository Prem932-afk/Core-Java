public class Reversarray 
{
   public static void main(String[] args) 
   {
     int arr[]={123, 567, 453, 678, 876};

     for(int i=0; i<arr.length; i++)
     {
        int num=arr[i];
        int reverse=0;

        while(num>0)
        {
            int digit = num % 10;    // Get the last digit
            reverse = reverse * 10 + digit; // Build the reversed number
            num=num/10;

        }
        System.out.println(arr[i] + "\t\t" + reverse);
     }
   }    
}
