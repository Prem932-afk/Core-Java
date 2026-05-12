// 11)
// Implement a program where a Building class is inherited by a House class, and then a Mansion class inherits from House. Each class should have unique properties.


// Multilevel Inheritance Example

class P11
{
    public static void main(String[] args)
    {
        // Creating Mansion object
        Mansion m = new Mansion();

        // Calling methods
        m.showBuilding();
        m.showHouse();
        m.showMansion();
    }
}

// Parent Class
class Building
{
    int floors = 2;

    void showBuilding()
    {
        System.out.println("Building Floors : " + floors);
    }
}

// Child Class
class House extends Building
{
    int rooms = 5;

    void showHouse()
    {
        System.out.println("House Rooms : " + rooms);
    }
}

// Grandchild Class
class Mansion extends House
{
    boolean swimmingPool = true;

    void showMansion()
    {
        System.out.println("Swimming Pool Available : " + swimmingPool);
    }
}