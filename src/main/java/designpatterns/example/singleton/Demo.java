package designpatterns.example.singleton;

public class Demo {
    public static void main(String args[]) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        s1.setName("Name by S1");
        s2.setName("Name by S2");
        System.out.println(s3.getName());
    }
}
