// Q.1  Print the elements of an array :
//  Explanation: Simply traverse the array and print each element. This teaches students how to iterate through an   ar    using loops.

//   Input: arr = [1, 2, 3, 4, 5]
//   Output: 1 2 3 4 5

class P1
{
    public static void main(String args[])
    {
        int arr[]={1, 2, 3, 4, 5};

        for(int i=0; i<=arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}