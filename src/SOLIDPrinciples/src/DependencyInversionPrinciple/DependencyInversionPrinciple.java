package DependencyInversionPrinciple;

// Bad Example
class Engine {
    String manufacturer;
    String fuelType;

    public void start() {
    }
}
class Car {
    private Engine engine;
    public Car() {
        this.engine = new Engine();
    }
    public void start() {
        engine.start();
    }
}

// Good Example
//interface Engine {
//    String manufacturer = "Hyundai";
//
//    public void start();
//}
//interface fuelTypePetrol {
//    String fuelType = "Petrol";
//}
//interface fuelTypeDiesel {
//    String fuelType = "Diesel";
//}
//class PetrolCar implements fuelTypePetrol{
//    private Engine engine;
//    public Car() {
//        this.engine = new Engine();
//    }
//    public void start() {
//        engine.start();
//    }
//}
//
//class DieselCar implements fuelTypeDiesel{
//    private Engine engine;
//    public Car() {
//        this.engine = new Engine();
//    }
//    public void start() {
//        engine.start();
//    }
//}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {

    }
}
