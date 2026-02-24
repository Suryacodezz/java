package java_basics_fundamentals;

public class Prime {

        public static void main(String[] args) {

            int num = 9;   // given number
            int i = 2;
            boolean isPrime = true;

            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (num <= 1)
                isPrime = false;

            if (isPrime)
                System.out.println(num + " is a Prime number");
            else
                System.out.println(num + " is not a Prime number");
        }
    }
