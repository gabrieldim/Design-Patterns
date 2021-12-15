package Singleton;

class SingletonClassObjectExample{

    /*
    static instance
    private default constructor
    static Getter method
     */
    static SingletonClassObjectExample obj = new SingletonClassObjectExample();

    private SingletonClassObjectExample(){


    }
    public static SingletonClassObjectExample getInstance(){
        return obj;
    }

}
