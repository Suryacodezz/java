package ObjectOrientationPrgm;


    class Calculator {

        // same method name, different parameters
        void add(int a, int b) {
            System.out.println("Sum of two numbers: " + (a + b));
        }

        void add(int a, int b, int c) {
            System.out.println("Sum of three numbers: " + (a + b + c));
        }
    }


    class Animals {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }

    class cat extends Animals {

        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public class Demo {
        public static void main(String[] args) {

            Calculator c = new Calculator();
            c.add(10, 20);
            c.add(10, 20, 30);

            Animals a = new Animals();
            a.sound();
        }
    }

