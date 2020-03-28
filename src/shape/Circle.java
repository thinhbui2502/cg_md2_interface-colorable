package shape;

import colorable.IColorable;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea () {
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius = "
                + radius
                + " color = "
                + getColor()
                +" - Area: "
                + getArea();
    }

}
