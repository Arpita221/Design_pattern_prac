import prototype.Bus;
import prototype.Car;
import prototype.Vehicle;
import prototype.VehicleCache;

import java.util.ArrayList;
import java.util.List;

public class Mainapp {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("car_brand", "car_model", "car_color", 300));
        vehicles.add(new Bus("bus_brand", "bus_model", "bus_color", 8));

        // Cloning vehicles into a new list
        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }

        // Print the cloned list
        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        // Using VehicleCache
        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);

        // Retrieve a vehicle from the cache
        System.out.println(registry.get("car_brand car_model"));
    }
}
