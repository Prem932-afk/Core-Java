
    public class ReverseArray {
        public static void main(String[] args) {
           
            int[] a = {123, 567, 453, 678, 876};
    
            
            for (int i = 0; i < a.length; i++) 
            {
                System.out.print(reverseNumber(a[i]) + " ");
            }
        }
    
        // Method to reverse a number
        public static int reverseNumber(int num) 
        {
            int reversed = 0;
            while (num != 0) 
            {
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }
            return reversed;
        }
    }
    

