package Singleton;

public class DbCon2 {
    static DbCon2 dbCon = new DbCon2();

    public DbCon2() {
    }

    public static void setDbCon(DbCon2 dbCon) {
        DbCon2.dbCon = dbCon;
    }

    public static DbCon2 getDbCon() {
        return dbCon;
    }
    public void printSomething() {
        System.out.println("Inside  Singleton Singleton.DbCon2");
    }
}
