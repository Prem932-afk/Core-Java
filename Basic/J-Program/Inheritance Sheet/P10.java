// 10)
// Create a program where a Vehicle class is inherited by a Car class, which is then inherited by a SportsCar class. Each class should have its own unique method.


class Vehicle
{
    void startEngine() 
    {
        System.out.println("Vehicle engine started.");
    }
}

class Car extends Vehicle 
{
    void playMusic() 
    {
        System.out.println("Car music system is playing.");
    }
}

class SportsCar extends Car 
{
    void turboBoost() 
    {
        System.out.println("SportsCar turbo boost activated!");
    }

    public static void main(String[] args) 
    {
        SportsCar sc = new SportsCar();

        // Accessing methods from all three classes
        sc.startEngine();  // From Vehicle
        sc.playMusic();    // From Car
        sc.turboBoost();   // From SportsCar
    }
}
