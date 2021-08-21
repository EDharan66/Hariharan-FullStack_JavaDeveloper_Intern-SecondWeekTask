import Color.GreenColor;
import Color.RedColor;
import Shape.Shape;
import Shape.Triangle;
import Shape.Pentagon;

public class BridgePatternExample {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
