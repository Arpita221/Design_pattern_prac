package decorator;


    public class Mainapp {
        public static void main(String[] args) {
            // Basic coffee
            Coffe coffe = new BasicCoffee();
            System.out.println(coffe.getDescription() + " -> $" + coffe.getCost());

            // Add milk
            coffe = new MilkDecorator(coffe);
            System.out.println(coffe.getDescription() + " -> $" + coffe.getCost());

            // Add sugar
            coffe = new SugerDecorator(coffe);
            System.out.println(coffe.getDescription() + " -> $" + coffe.getCost());

            // Add whipped cream
        }
    }


