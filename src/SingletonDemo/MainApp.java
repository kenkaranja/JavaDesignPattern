package SingletonDemo;

public class MainApp {
    public static void main(String... args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Hash code:" + singleton.hashCode());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Hash code:" + singleton1.hashCode());

        if(singleton==singleton1){
            System.out.println("same instance being used");
        }
    }//main
}//MainApp
