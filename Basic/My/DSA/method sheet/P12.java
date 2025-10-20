public class P12 
{
    public static void main(String[] args) 
    {
        int num = 1234;
        String str = Integer.toString(num);
        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i += 2) 
        {
            // swap every two digits
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        int result = Integer.parseInt(new String(arr));
        System.out.println("Swapped number: " + result);
    }
}
