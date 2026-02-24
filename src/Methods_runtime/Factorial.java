package Methods_runtime;

public class Factorial {
        static int factorial(int n) {
            if (n == 0 || n == 1)
                return 1;
            else
                return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            int num = 4;
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
    }

