package ObjectPool;

public class Mutex {
    private static java.util.concurrent.locks.Lock reentrantLock = new java.util.concurrent.locks.ReentrantLock();

    public void acquire() {
        reentrantLock.lock();
    }

    public void release() {
        reentrantLock.unlock();
    }
}//class Mutex

