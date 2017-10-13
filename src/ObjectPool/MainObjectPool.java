package ObjectPool;

public class MainObjectPool {
    public static void main(String... args) {
        ReusablePool pool = ReusablePool.getInstance();
        for (int count = 0; count < ReusablePool.DEFAULT_POOL_SIZE + 1; count++) {

            ReusableVisitor visitor = pool.acquireVisitor();
            if (visitor == null) {
                System.out.println(count + ": no more visitors available");
                break;
            }
            //use the visitor
            System.out.println(count + "-Using visitor:" + visitor.hashCode());
            // pool.releaseVisitor(visitor);
        }
        for (int count = 0; count < ReusablePool.DEFAULT_POOL_SIZE + 1; count++) {

            ReusableVisitor visitor = pool.acquireVisitor();
            if (visitor == null) {
                System.out.println(count + ": no more visitors available");
                break;
            }
            //use the visitor
            System.out.println(count + "-Using visitor:" + visitor.hashCode());
            // pool.releaseVisitor(visitor);
        }


    }//main
}//class MainObjectPool
