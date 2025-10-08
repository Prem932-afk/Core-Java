// 1. Bubble Sort :
//    -> Bubble sort is a simple sorting method where we compare two
//       side-by-side numbers in a list and swap them if they are in
//       the wrong order. This continues until the list becomes sorted.

class P1 
{
    public static void main(String args[]) 
    {
        int arr[] = {10, 25, 12, 40, 6};
        int temp = 0;

        for (int i = 0; i < arr.length ; i++) 
        {
            for (int j = 0; j < arr.length - 1 - i; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {  // compare side-by-side elements
                    // swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print sorted array
        for (int k : arr) 
        {
            System.out.println(k);
        }
    }
}
