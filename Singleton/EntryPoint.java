package Singleton;

public class EntryPoint {

    public static void main(String[] args) {

        SingletonClassObjectExample object = SingletonClassObjectExample.getInstance();
        //SingletonClassObjectExample object2 = new SingletonClassObjectExample(); // not available

    }
}
