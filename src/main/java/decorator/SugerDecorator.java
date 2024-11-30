package decorator;

public class SugerDecorator extends CoffeDecorator {
    public SugerDecorator(Coffe coffe) { // Constructor
        super(coffe);
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffe.getCost() + 0.5; // Adds the cost of sugar
    }
}
