package prototype;

public class Bus extends Vehicle {
    private int capacity;

    public Bus(String brand, String model, String color, int capacity) {
        super(brand, model, color);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity=" + capacity + " passengers";
    }
}
