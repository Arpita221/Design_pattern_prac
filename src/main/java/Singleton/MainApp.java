package Singleton;

public class MainApp {
    public static void main(String[] args) {
        // First instance of SingletonPac with "Geekific" data
        SingletonPac singleton1 = SingletonPac.getInstance("Geekific");
        System.out.println(singleton1);

        // Second attempt to get Singleton instance with "Singleton" data
        SingletonPac singleton2 = SingletonPac.getInstance("Singleton");
        System.out.println(singleton2);

        // Accessing the data of the Singleton instance
        System.out.println(singleton1.getData());
        System.out.println(singleton2.getData());  // Should print the same data as singleton1
    }
}
