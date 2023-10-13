package solid_principles.liskov_substitution_principle.solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionProgram {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        // Now - Adding the Bicycle Object to the class Vehicle will not throw exception
        // since the Vehicle class only has those method applicable to Bicycle as well.
        vehicles.add(new Bicycle());

        for(Vehicle vehicle: vehicles) {
            // when vehicle == Bicycle object - will not throw exception - since bicycle doesn't have hasEngine().
            // System.out.println(vehicle.hasEngine().toString());
            System.out.println(vehicle.getNumOfWheels());
        }

    }
}

class Vehicle {
    public Integer getNumOfWheels() {
        return 2;
    }
}

class EngineVehicle extends Vehicle {
    public Boolean hasEngine() {
        return true;
    }
}

class MotorCycle extends EngineVehicle {
}

class Car extends EngineVehicle {
    @Override
    public Integer getNumOfWheels() {
        return 4;
    }
}

// The class Bicycle narrows the functionality of Vehicle Class.
// replacing with the value of Bicycle object breaks the functionality.
class Bicycle extends Vehicle {
}


