// Superclass with private members
class Superclass {
    // Private member
    private String name;

    // Constructor to initialize the private member
    public Superclass(String name) {
        this.name = name;
    }

    // Public getter method to access the private member
    public String getName() {
        return name;
    }

    // Public setter method to modify the private member
    public void setName(String name) {
        this.name = name;
    }
}

// Subclass that inherits from Superclass
class Subclass extends Superclass {

    // Constructor for Subclass
    public Subclass(String name) {
        super(name);  // Calling the constructor of the superclass
    }

    // Method to attempt access of private member (this will fail)
    public void attemptAccessPrivateMember() {
        // Direct access to the private member 'name' would fail
        // System.out.println("Name: " + name);  // This would result in a compilation error

        // Instead, access the private member through the public getter
        System.out.println("Accessing name through getter: " + getName());
    }
}

// Main class to test the inheritance and access behavior
public class Method25 {
    public static void main(String[] args) {
        // Create an instance of the Subclass
        Subclass subclass = new Subclass("John");

        // Attempt to access the private member through the subclass
        subclass.attemptAccessPrivateMember();

        // Modify the private member using the setter method
        subclass.setName("Alice");

        // Access the modified value through the getter method
        subclass.attemptAccessPrivateMember();
    }
}
