package POO_Exercises;

public class Rectangle {
    double height;
    double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2*(this.height + this.width);
    }
}
