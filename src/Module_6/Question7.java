package Module_6;

public class Question7 {
        public static void main(String[] args) {
            int[] arr = {3, -2, -5, 6, -1, 4};

            int j = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

}
