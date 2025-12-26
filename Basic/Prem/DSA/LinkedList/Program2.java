import java.util.*;

class Program2
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation()
    {
        int data, n, m;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your Data");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null)
            {
                head = new_node;
            }
            else
            {
                System.out.println(
                "Enter 1: Insert at Beginning\nEnter 2: Insert at End\nEnter 3: Insert at Middle");
                m = sc.nextInt();

                switch (m)
                {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null)
                        {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3:
                        System.out.println("Enter position");
                        int p = sc.nextInt();

                        Node temp1 = head;
                        for (int i = 1; i < p - 1; i++)
                        {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }

            System.out.println("Do you want to add more data? Press 1");
            n = sc.nextInt();

        } while (n == 1);
    }

    public void traverser()
    {
        Node temp = head;
        if (head == null)
        {
            System.out.println("Linked List doesn't exist");
        }
        else
        {
            while (temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String args[])
    {
        Program2 p = new Program2();
        p.creation();
        p.traverser();
    }
}
