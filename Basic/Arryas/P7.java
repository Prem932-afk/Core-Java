public class P7 
{
  public static void main(String[] args) 
  {
    int arr[]={5, 9, 11, 2};

    int key=13;

    boolean found=false;

    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]==key)
        {
            found=true;
            break;
        }
       
    }
    if(found==true)
    {
        System.out.println("Yes Found");
    }
    else
    {
        System.out.println("Not found");
    }
  }    
}
