package ObjectOrientationPrgm;


    class Shape {
        void draw() {
            System.out.println("Drawing a Shape");
        }
    }

    // Derived class Circle
    class Circle extends Shape {

        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Derived class Rectangle
    class Rectangle extends Shape {

        @Override
        void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }
    public class Polymorphism {
        public static void main(String[] args) {
            Shape s;
            s = new Circle();
            s.draw();
            s = new Rectangle();
            s.draw();
        }
    }

