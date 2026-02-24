package Methods_runtime;

public class Palindrome {
        static boolean isPalindrome(String str) {
            int start = 0;
            int end = str.length() - 1;
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

        public static void main(String[] args) {
            String word = "dad";
            if (isPalindrome(word))
                System.out.println(word + " is a Palindrome");
            else
                System.out.println(word + " is not a Palindrome");
        }
    }

