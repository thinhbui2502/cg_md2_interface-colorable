import shape.Shape;
import shape.Square;
import shape.Circle;
import colorable.IColorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(15,"Green");
        shapes[1] = new Circle(6,"Pink");

        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof IColorable) {
                ((IColorable) shape).howToColor();
            }
        }
    }
}