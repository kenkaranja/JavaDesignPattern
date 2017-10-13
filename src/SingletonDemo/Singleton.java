package SingletonDemo;

public class Singleton {
    protected static Singleton instance = null;

    //constructors and instance management are disabled outside of this class
    protected Singleton() {
    }

    public static Singleton getInstance() {
        Lock criticalSection = new Lock();   //used in multithreaded environemnt- prevent concurrency access
        //critical Section begins
        if (instance == null) {
            instance = new Singleton();
        }
        criticalSection.release();
        //critical section ends
        return instance;
    }
}//Singleton
