abstract class Vehicle
{
    String brand;
    int speed;

    Vehicle(String brand , int speed)
    {
        this.brand = brand;
        this.speed = speed;
    }
    
    void display()
    {
        System.out.println("" + brand + " " + speed);
    }

    abstract void start();
}

class Car extends Vehicle
{
    Car (String brand , int speed)
    {
        super(brand, speed);

    }
    @Override 
    void  start()
    {
        System.out.println("Car is Started");
    }
    void openboot()
    {
        System.out.println(brand + " " + "boot is open");
    }
}

class Bike extends  Vehicle
{
    Bike(String brand , int speed)
    {
        super(brand, speed);
    }
    @Override 
    void  start()
    {
        System.out.println("Bike is Started");
    }
}

public class exercise1
{
    public static void main(String[] args) {
        Vehicle v1 = new Car("BMW", 180);
        Vehicle v2 = new Bike("Yamaha",120);
        v1.start();
        v1.display();

        v2.start();
        v2.start();

        Car c = (Car) v1;
        c.openboot();
    }
}