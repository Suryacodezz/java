package Module_6;

public class Question2 {

        public static void main(String[] args) {

            int[] arr = {2, 4, 6, 8, 10};
            int n = arr.length;

            int[] prefix = new int[n];
            prefix[0] = arr[0];

            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }

            int l = 1;
            int r = 3;

            int sum;
            if (l == 0)
                sum = prefix[r];
            else
                sum = prefix[r] - prefix[l - 1];

            System.out.println("Range Sum = " + sum);
        }
    }

