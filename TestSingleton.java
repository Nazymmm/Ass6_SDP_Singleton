package Ass6;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton sg1;


        sg1= Singleton.getInstance();

        sg1.getConnection();
    }
}
