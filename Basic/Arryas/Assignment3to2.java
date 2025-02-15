public class Assignment3to2 
{
    public static void main(String[] args) 
    {
        
   
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    
    int target=12;

    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; i<arr.length; j++)
        {
            for(int s=j+1; s<arr.length; s++)
            {
              if(arr[i]+arr[j]+arr[s]==target)
              {
                System.out.println(arr[i] + " " + arr[j] + " " + arr[s]);
              }
           }
        }
    }
  }
}
// Q)array :1,2,3,4,5,6,7,8,9,10 

// target sum of three number pair 
// target :12 

// pair :
// 6 4 2 
// 8 3 1 
// 9 2 1 
// 5 4 3 

// pair :find 
// ->count 
// ->which index 