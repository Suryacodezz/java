package java_basics_fundamentals;

public class PyramidPattern {

        public static void main(String[] args) {

            int r = 5;   // number of rows

            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }

