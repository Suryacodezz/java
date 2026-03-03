package Module_4;

final class FinalClass {
    void display() {
        System.out.println("Final class method");
    }
}

class Parent {
    final void show() {
        System.out.println("hi");
    }
}

class Child extends Parent {
}

public class Question5 {
    public static void main(String[] args) {

        final int x = 10;
        System.out.println("Final variable: " + x);

        Parent obj = new Child();
        obj.show();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}