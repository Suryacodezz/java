package Module_8;

public class Question5 {
        public static void main(String[] args) {
            int n = 11;
            int count = 0;

            while (n != 0) {
                count += (n & 1);
                n >>= 1;
            }

            System.out.println(count);
        }

}
