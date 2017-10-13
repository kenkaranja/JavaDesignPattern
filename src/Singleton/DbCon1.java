package Singleton;

public class DbCon1 {
    static DbCon1 dbCon;

    private DbCon1() {
    }

    static {
        dbCon = new DbCon1();
    }

    public static DbCon1 getDbCon() {
        return dbCon;
    }

    public static void setDbCon(DbCon1 dbCon) {

        DbCon1.dbCon = dbCon;
    }

    public void printSomething() {
        System.out.println("Inside  Singleton Singleton.DbCon1");
    }
}
