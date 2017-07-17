package singletone;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class SingleTone {
    private static SingleTone instance = new SingleTone();
    public static SingleTone getInstance() {
        return instance;
    }

    private int myVal;

    private SingleTone() {
    }

    public int getMyVal() {
        return myVal;
    }

    public void setMyVal(int myVal) {
        this.myVal = myVal;
    }
}
