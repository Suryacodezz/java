package Methods_runtime;


    class Student {

        int id;
        String name;
        // Default Constructor
        Student() {
            id = 0;
            name = "Unknown";
        }
        // Parameterized Constructor
        Student(int i, String n) {
            id = i;
            name = n;
        }
        void display() {
            System.out.println("ID: " + id + " Name: " + name);
        }
    }
    public class ConstructorDemo {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student(101, "Surya");

            s1.display();
            s2.display();
        }
    }

