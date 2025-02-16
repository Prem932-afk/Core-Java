public class ShallowCopy 
{
    // print array
    public static void printArray(int a[]) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int a[] = { 1, 2, 3, 4, 5 };
        //copy array 
        int b[]=a;
        a[0]=0;
        a[1]=0;
        printArray(a);//0 0 3 4 5 
        printArray(b);//0 0 3 4 5 (1 2 3 4 5 )
    }
}

// shallow copy 
// a[]
// b[]=a
// c[]=b 
// a[] :change check c update 