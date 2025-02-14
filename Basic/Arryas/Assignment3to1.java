public class Assignment3to1 {
    public static void main(String[] args) {
        int a[]={34,65,243,544,643,232,543,322};
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("totoal number");
        System.out.println(a.length);
        int x=243;
        System.out.println("Gretor number");
        for(int i=0; i<a.length; i++)
        {
           if(a[i]>x)
           {
            System.out.println(a[i]);
           }
        }

        System.out.println("Index ");
        for(int i=0; i<a.length; i++)
        {
             System.out.println("index : "+ i +" " +"value : "+a[i]);
        }
    }
}
