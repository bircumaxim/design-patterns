package prototype.Shapes;

import prototype.Shape;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class Circle implements Shape {

    private String circleName;

    public Circle(String circleName) {
        this.circleName = circleName;
    }

    @Override
    public Shape makeCopy() {
        Circle circleObj = null;
        try {
            circleObj = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return circleObj;
    }

    @Override
    public void render() {
        System.out.println(circleName + " " + System.identityHashCode(this));
    }
}
