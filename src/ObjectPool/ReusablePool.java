package ObjectPool;

import java.util.ArrayList;

public class ReusablePool {
    public static final int DEFAULT_POOL_SIZE = 10;


    //data attibutes
    private ArrayList<ReusableVisitor> reusables;
    private int maxPoolSize = DEFAULT_POOL_SIZE;


    protected static ReusablePool instance = null;

    //constructors and instance management are disabled outside of this class
    protected ReusablePool() {
        reusables = new ArrayList<ReusableVisitor>();
    }

    //operations
    public ReusableVisitor acquireVisitor() {
        Lock criticalSection = new Lock();
        //search for reusable object which already exist
        for (ReusableVisitor visitor : reusables) {
            if (!visitor.isInUse()) {
                visitor.setInUse(true);
                criticalSection.release();
                return visitor;
            }
        }
        //create and add new reusable instance to the pool
        if (reusables.size() >= getMaxPoolSize()) {
            //the pool limit is reachec, we fail:
            criticalSection.release();
            return null;
        }
        ReusableVisitor visitor = new ReusableVisitor();
        visitor.setInUse(true);
        reusables.add(visitor);
        criticalSection.release();
        return visitor;
    }


    public void releaseVisitor(ReusableVisitor subject) {
        Lock criticalSection = new Lock();
        int index = reusables.indexOf(subject);
        if (index == -1) {
            //nothing to do this subject is not in the pool
            criticalSection.release();
            return;
        }
        ReusableVisitor visitor = reusables.get(index);
        visitor.setInUse(false);
        criticalSection.release();
    }


    public int getMaxPoolSize() {
        return maxPoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }


    //singleton implementations
    public static ReusablePool getInstance() {
        Lock criticalSection = new Lock();   //used in multithreaded environemnt- prevent concurrency access
        //critical Section begins
        if (instance == null) {
            instance = new ReusablePool();
        }
        criticalSection.release();
        //critical section ends
        return instance;
    }
}//Singleton

