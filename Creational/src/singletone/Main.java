package singletone;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class Main {
    public static void main(String[] args) {
        SingleTone singleToneInstance1 = SingleTone.getInstance();
        singleToneInstance1.setMyVal(10);
        SingleTone singleToneInstace2 = SingleTone.getInstance();
        System.out.println(singleToneInstace2.getMyVal());
    }
}
