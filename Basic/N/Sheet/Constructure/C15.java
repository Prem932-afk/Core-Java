// 18)
// Constructor with Boolean Parameter:

// Define a class Light with a boolean instance variable isOn. Create a constructor that accepts a boolean value and initializes isOn.

public class C15 
{
  public static void main(String[] args) 
  {
      Light l=new Light(true);

      l.display();
  }    
}

class Light
{
    boolean ison;

    Light(boolean ison)
    {
        this.ison=ison;
    }
    void display()
    {
        if(ison=true)
        {
            System.out.println("Light On");
        }
        else 
        {
             System.out.println("Light off");
        }
    }
}
