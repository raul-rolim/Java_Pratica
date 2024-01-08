package POO_Exercises;

public class Circle {
    final double PI = 3.14159;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return Math.floor(2 * PI * this.radius * 100) / 100;
    }

    public double getArea() {
        return Math.floor(Math.pow(radius, 2) * PI * 100) / 100;
    }
}
