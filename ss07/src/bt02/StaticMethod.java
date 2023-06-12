package bt02;

public class StaticMethod {
    static final double PI = 3.14;

    public double calCircleArea(double r) {
        return PI * r * r;
    }

    public double calRectangleArea(double width, double height) {
        return width * height;
    }

    public double calTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
