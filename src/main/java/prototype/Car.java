package prototype;

public class Car extends Vehicle {
    private int speed;

    public Car(String brand, String model, String color, int speed) {
        super(brand, model, color);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=" + speed + " km/h";
    }
}
