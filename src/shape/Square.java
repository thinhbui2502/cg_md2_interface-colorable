package shape;

import colorable.IColorable;

public class Square extends Shape implements IColorable {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public String toString() {
        return "Square{"
                + "side = "
                + side
                + " color = "
                + getColor()
                + '}'
                +" - Area: "
                + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all for sides!");
    }
}
