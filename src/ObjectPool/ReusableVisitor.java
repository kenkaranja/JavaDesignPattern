package ObjectPool;

public class ReusableVisitor {
    //data attributes
    private boolean inUse = false;

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}//class ReusableVisitor
