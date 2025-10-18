
import java.util.*;
class Program1
{
     static class Node
     {
            int data;
            Node next;
            Node(int data)
            {
                this.data=data;
                this.next=null;
            }
     }

     Node head=null;

     public void creation()
     {
        int data, n;
        Scanner sc=new Scanner(System.in);


        do{
           System.out.println("Enter your Data");
           data=sc.nextInt();

           Node new_node=new Node(data);

           if(head==null)
           {
               head=new_node;
           }
           else
           {
               new_node.next=head;
               head=new_node;
           }
             System.out.println("Do you want to add More data press 1");
             n=sc.nextInt();
        }
        while(n==1);
     }

     public void traverser()
     {
        Node temp=head;
        if(head==null)
        {
             System.out.println("LL Doesn't Exits");
        }
        else
        {
            if(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
     }
    public static void main(String args[])
    {
       Program1 p=new Program1();
        p.creation();
        p.traverser();
    }
}