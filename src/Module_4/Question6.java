package Module_4;

class Student {

    static String college = "SCE College";
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(name + " " + rollNo + " " + college);
    }
}

public class Question6 {
    public static void main(String[] args) {

        Student s1 = new Student("Surya", 1);
        Student s2 = new Student("Rahul", 2);

        s1.display();
        s2.display();

        Student.changeCollege("SNPSU College");

        s1.display();
        s2.display();
    }
}
