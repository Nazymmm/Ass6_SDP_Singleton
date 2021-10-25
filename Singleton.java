package Ass6;

public class Singleton {
    private static Singleton sgObject;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (sgObject == null) {
            sgObject = new Singleton();
        }
        return sgObject;
    }
    public void getConnection() {
        System.out.println("Connecting");
    }
}
