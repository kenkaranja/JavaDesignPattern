package AbstractFactory;

public class MainAbs {
    public static void main(String... args) {
        AbstractF abstractF = new AbstractF();
        AccountFactory accountFactory= (AccountFactory) abstractF.getFactory("A");
        accountFactory.create("business");
    }
}
