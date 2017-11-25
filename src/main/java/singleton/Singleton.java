package singleton;

public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
