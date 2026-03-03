package Module_4;

abstract class Shape {

    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
public class Question1 {
    public static void main(String[] args) {

        Shape c = new Circle(5);
        System.out.println("Circle Area: " + c.area());

        Shape r = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + r.area());
    }
}
