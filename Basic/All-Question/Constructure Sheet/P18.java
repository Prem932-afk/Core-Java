// Constructor with Boolean Parameter:

// Define a class Light with a boolean instance variable isOn. Create a constructor that accepts a boolean value and initializes isOn.


public class P18 
{
    public static void main(String[] args) 
    {

        Light l =new Light(false);
    }
}
class Light
{
    boolean isOn;
    Light(boolean isOn)
    {
        this.isOn=isOn;
        if(isOn==true)
        {
            System.out.println("Ligh is On : "+  isOn);
        }
        else
        {
           System.out.println("Light is Of : "+ isOn);
        }
        
    }
}

