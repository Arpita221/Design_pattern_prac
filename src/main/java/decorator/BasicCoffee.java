package decorator;

public class BasicCoffee implements  Coffe{
    @Override
    public String getDescription() {
        return "Basic Coffe";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
