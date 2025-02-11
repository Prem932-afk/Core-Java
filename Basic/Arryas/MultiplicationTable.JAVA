public class MultiplicationTable {
    public static void main(String[] args) {
       
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

       
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.println("Multiplication table for " + numbers[i] + ":");
            
            
            for (int j = 1; j <= 10; j++) 
            {
                System.out.println(numbers[i] + " x " + j + " = " + (numbers[i] * j));
            }
            System.out.println();
        }
    }
}
