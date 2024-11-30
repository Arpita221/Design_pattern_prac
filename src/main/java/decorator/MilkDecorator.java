package decorator;

public class MilkDecorator extends CoffeDecorator {
    public MilkDecorator(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffe.getCost() + 1.5; // Adding milk cost
    }

}
