package factory;

// Factory class to create Burger objects
public class BurgerFactory {

    // Factory method to create a Burger instance
    public static Burger getBurger(String burgerType) {
        if (burgerType == null) {
            throw new IllegalArgumentException("Burger type cannot be null");
        }

        switch (burgerType.toLowerCase()) {
            case "classicburger":
                return new ClassicBurger();
            case "orientalburger":
                return new OrientalBurger();
            default:
                throw new IllegalArgumentException("Unknown burger type: " + burgerType);
        }
    }
}
