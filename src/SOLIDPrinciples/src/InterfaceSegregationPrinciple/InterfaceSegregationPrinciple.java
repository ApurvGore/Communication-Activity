package InterfaceSegregationPrinciple;

// Bad Example
interface Vehicle {
    public void moveForwards();
    public void moveBackwards();
    public void refuel();
    public void openDoors();
}

class Car implements Vehicle {
    @Override
    public void moveForwards() {

    }
    @Override
    public void moveBackwards() {

    }
    @Override
    public void refuel() {

    }
    @Override
    public void openDoors() {

    }
}

class Bike implements Vehicle {
    @Override
    public void moveForwards() {

    }
    @Override
    public void moveBackwards() {

    }
    @Override
    public void refuel() {

    }

    @Override
    public void openDoors() {

    }

}

// Good Example
//interface Vehicle {
//    public void moveForwards();
//    public void moveBackwards();
//    public void refuel();
//}
//interface hasDoors {
//    public void openDoors();
//}
//class Car implements Vehicle, hasDoors {
//
//    @Override
//    public void moveForwards() {
//
//    }
//    @Override
//    public void moveBackwards() {
//
//    }
//    @Override
//    public void refuel() {
//
//    }
//    @Override
//    public void openDoors() {
//
//    }
//}
//
//class Bike implements Vehicle {
//    @Override
//    public void moveForwards() {
//
//    }
//    @Override
//    public void moveBackwards() {
//
//    }
//    @Override
//    public void refuel() {
//
//    }
//}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {

    }
}
