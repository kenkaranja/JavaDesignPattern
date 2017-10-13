package Singleton;

public class DbCon3 {
    static DbCon3 dbCon3;

    public DbCon3() {
    }

    public static DbCon3 getDbCon3() {
        if (dbCon3 == null) {
            dbCon3 = new DbCon3();
        }
        return dbCon3;
    }

    public static void setDbCon3(DbCon3 dbCon3) {
        DbCon3.dbCon3 = dbCon3;
    }
    public void printSomething() {
        System.out.println("Inside  Singleton Singleton.DbCon3");
    }
}
