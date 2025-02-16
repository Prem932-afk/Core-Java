public class Assignment1to14 
{
    public static void main(String[] args) 
	{
        // Create the array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Loop through the array and use an if condition to check for the required values
        for (int i = 0; i < array.length; i++) 
		{
            if (array[i] == 9 || array[i] == 7 || array[i] == 4 || array[i] == 2) 
			{
                System.out.println(array[i]);
            }
        }
    }
}

