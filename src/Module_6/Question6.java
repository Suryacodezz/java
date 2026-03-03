package Module_6;

public class Question6 {
        public static void main(String[] args) {
            int[] arr = {2, 2, 1, 1, 2, 2, 2};

            int candidate = arr[0];
            int count = 1;

            for (int i = 1; i < arr.length; i++) {
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                } else if (arr[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            System.out.println("Majority Element: " + candidate);
        }

}
