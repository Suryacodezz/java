package Module_4;

public class Question3 {

    public static void main(String[] args) {

        String s1 = "Hello";
        s1.concat(" World");
        System.out.println("String: " + s1);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);
    }
}