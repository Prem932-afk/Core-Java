public class Tableprint 
{
  public static void main(String[] args) 
  {

        
            // Create the array
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            
            // Print the array as a table
            System.out.println("Index\tValue");
            for (int i = 0; i < array.length; i++) 
            {
                System.out.println(i + "\t" + array[i]);
            }
      
    
    
  }    
}
