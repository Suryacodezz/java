package module_5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question1 {

    static void checkedExample() {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            fr.close();
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e);
        }
    }

    static void uncheckedExample() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        checkedExample();
        uncheckedExample();
    }
}