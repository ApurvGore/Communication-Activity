package OpenClosePrinciple;

// Bad Example
class Vehicle {
    int numberOfWheels;

    public void moveForwards() {

    }

    public void moveBackwards() {

    }
}

class Car extends Vehicle {
    public void carryPassengers() {
        // Cars are generally meant for carrying people from one location to another
    }
}

class Truck extends Vehicle {
    public void transportGoods() {
        // Trucks are generally used for transporting goods from one location to another
    }
}

class TowTruck extends Vehicle {
    // However, this needs additional accessories like hook / winch
    // How do you proceed here?
    // Would you add the hook / winch accessory in the vehicle class itself?
    public void towVehicles() {
        // Tow trucks are used for towing vehicles
    }
}

// Good Example
//class Vehicle {
//    int numberOfWheels;
//
//    public void moveForwards() {
//
//    }
//
//    public void moveBackwards() {
//
//    }
//}
//
//class Car extends Vehicle {
//    public void carryPassengers() {
//        // Cars are generally meant for carrying people from one location to another
//    }
//}
//
//class Truck extends Vehicle {
//    public void transportGoods() {
//        // Trucks are generally used for transporting goods from one location to another
//    }
//}
//
//class TowTruck extends Vehicle {
//    private Accesory accesory;
//    public void towVehicles() {
//        // Tow trucks are used for towing vehicles
//    }
//}

public class OpenClosePrinciple {
    public static void main(String[] args) {

    }
}
