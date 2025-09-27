// Q.5  Reverse an array :
// Explanation: Reverse the order of elements in the array. This demonstrates array manipulation and swapping.

//   Input: arr = [1, 2, 3, 4]
//   Output: 4, 3, 2, 1

public class A5 
{
  public static void main(String[] args) 
  {
       int arr[]={1, 2, 3, 4};
       int i=0;
       int j=arr.length-1;
       int temp=0;

       while(i<j)
       {
           temp=arr[i];    // temp=1
           arr[i]=arr[j]; //  arr[i]=4
           arr[j]=temp;  //  arr[j]=1

           i++;
           j--;
       } 

       for(int k=0; k<arr.length; k++)
       {
            System.out.println(arr[k]);
       }

  }    
}
