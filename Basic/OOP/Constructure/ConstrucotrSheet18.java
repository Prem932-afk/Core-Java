public class ConstrucotrSheet18 {
    public static void main(String[] args) {
        Light light1 = new Light(true);
        light1.displayState();

        Light light2 = new Light(false);
        light2.displayState();

        light1.isOn = false;
        light1.displayState();
    }
}

class Light {
    boolean isOn;

    Light(boolean isOn) {
        this.isOn = isOn;
    }

    void displayState() {
        if (isOn) {
            System.out.println("The light is ON.");
        } else {
            System.out.println("The light is OFF.");
        }
    }
}

// Constructor with Boolean Parameter:

// Define a class Light with a boolean instance variable isOn. Create a
// constructor that accepts a boolean value and initializes isOn.
