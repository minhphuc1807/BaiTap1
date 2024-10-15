package Ex_Classes.Bai_1_1;

public class Circle {
    private double radius;
    private String color;

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
}
