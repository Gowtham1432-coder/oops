class Vehicle {
    String brand;
    int speed;
    int capacity;

    Vehicle(String brand, int speed, int capacity) {
        this.brand = brand;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void displayInfo() {
        System.out.println("This is vehicle details:");
        System.out.println("--------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Capacity: " + capacity + " persons");
        System.out.println();
    }
}

class Car extends Vehicle {
    Car(String brand, int speed, int capacity) {
        super(brand, speed, capacity); // Calling the parent constructor
    }

    @Override
    public void displayInfo() {
        System.out.println("This is car details:");
        System.out.println("--------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Capacity: " + capacity + " persons");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle bab = new Vehicle("Apple", 75, 4); // Fixed constructor
        bab.displayInfo();

        Car car = new Car("Honda", 150, 4);
        car.displayInfo();
    }
}
