package Module_9;
import java.util.*;
import java.util.*;

public class Question5 {



        static List<String> result = new ArrayList<>();

        static void generate(String current, int open, int close, int n) {

            if (current.length() == 2 * n) {
                result.add(current);
                return;
            }

            if (open < n) {
                generate(current + "(", open + 1, close, n);
            }

            if (close < open) {
                generate(current + ")", open, close + 1, n);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = sc.nextInt();

            generate("", 0, 0, n);

            for (String s : result) {
                System.out.println(s);
            }

            sc.close();
        }
    }