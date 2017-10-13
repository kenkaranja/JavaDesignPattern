package Singleton;

public class Main {
    public static void main(String... args) {
        DbCon1 d1 = DbCon1.getDbCon();
        DbCon1 d2 = DbCon1.getDbCon();
        System.out.println(d1.equals(d2));
        d1.printSomething();

        DbCon2 d3 = DbCon2.getDbCon();
        d3.printSomething();

        DbCon3 dbCon3 = DbCon3.getDbCon3();
        dbCon3.printSomething();



    }
}
