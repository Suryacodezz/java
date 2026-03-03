package Module_6;

public class Question10 {
        public static void main(String[] args) {

            int[] arr = {3, 6, 12, 1, 5, 8};
            int n = arr.length;

            int[] result = new int[n];
            int evenIndex = 0;
            int oddIndex = 1;

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0 && evenIndex < n) {
                    result[evenIndex] = arr[i];
                    evenIndex += 2;
                } else if (oddIndex < n) {
                    result[oddIndex] = arr[i];
                    oddIndex += 2;
                }
            }

            for (int num : result) {
                System.out.print(num + " ");
            }
        }

}
