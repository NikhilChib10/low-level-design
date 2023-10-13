package solid_principles.liskov_substitution_principle.problem;

import java.util.ArrayList;
import java.util.List;

// LISKOV SUBSTITUTION PROBLEM STATEMENT.
public class ProblemProgram {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        // Adding the Bicycle Object to the class
        // Bicycle object cannot replace the vehicle code
        // - since it narrows the functionality of Vehicle class and not implements the hasEngine method.
        vehicles.add(new Bicycle());

        for(Vehicle vehicle: vehicles) {
            // when vehicle == Bicycle object - will throw exception.
            System.out.println(vehicle.hasEngine().toString());
        }

    }
}

class Vehicle {
    public Integer getNumOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}

class MotorCycle extends Vehicle{
}

class Car extends Vehicle{
    @Override
    public Integer getNumOfWheels() {
        return 4;
    }
}

// The class Bicycle narrows the functionality of Vehicle Class.
// replacing with the value of Bicycle object breaks the functionality.
class Bicycle extends Vehicle{
    @Override
    public Boolean hasEngine() {
        return null;
    }
}

