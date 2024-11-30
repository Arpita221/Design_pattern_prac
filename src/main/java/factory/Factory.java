package factory;

public class Factory{
    public static void main(String[] args) {
        try {
            // Get a Classic Burger
            Burger classic = BurgerFactory.getBurger("ClassicBurger");
            classic.prepare();

            // Get an Oriental Burger
            Burger oriental = BurgerFactory.getBurger("OrientalBurger");
            oriental.prepare();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
