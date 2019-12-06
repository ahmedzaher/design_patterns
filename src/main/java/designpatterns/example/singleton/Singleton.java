package designpatterns.example.singleton;

public class Singleton {
    private static volatile Singleton instance;
    private String name;

    protected Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = instance == null ? new Singleton() : instance;
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
