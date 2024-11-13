package Singleton;

public class SingletonPac {
    private final String data; // Data field
    private static volatile SingletonPac instance; // Singleton instance

    // Private constructor to prevent instantiation from outside
    private SingletonPac(String data) {
        this.data = data;
    }

    // Public method to get the instance of Singleton
    public static SingletonPac getInstance(String data) {
        // First check (for performance reasons)
        SingletonPac result = instance;
        if (result == null) {
            // Synchronize only when necessary (first time instance creation)
            synchronized (SingletonPac.class) {
                // Double-check to ensure only one instance is created
                result = instance;
                if (result == null) {
                    instance = result = new SingletonPac(data);
                }
            }
        }
        return result;
    }

    // Getter for the data field
    public String getData() {
        return data;
    }
}
