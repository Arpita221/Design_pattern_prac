package prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleCache {
    private final Map<String, Vehicle> cache = new HashMap<>();

    public void put(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            cache.put(vehicle.getKey(), vehicle.clone());
        }
    }

    public Vehicle get(String key) {
        return cache.get(key);
    }
}
