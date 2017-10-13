package Factory;

public class MainFactory {
    public static void main(String... args) {
        AcountFactory acountFactory = new AcountFactory();
        acountFactory.create("business"); //create new BusinessAccount instance
        acountFactory.create("saving"); //create new SavingAccount instance




    }
}
