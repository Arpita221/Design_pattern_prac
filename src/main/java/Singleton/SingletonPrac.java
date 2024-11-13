package Singleton;

public class SingletonPrac {
    private final String  data ;
    private static volatile SingletonPrac instance;
    private Singleton(String data){
        this.data=data;

    }


}
