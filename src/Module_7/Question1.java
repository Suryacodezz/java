package Module_7;

public class Question1 {
        static int binarySearchIterative(int[] arr, int key) {
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == key)
                    return mid;
                else if (arr[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }

            return -1;
        }

        static int binarySearchRecursive(int[] arr, int low, int high, int key) {
            if (low > high)
                return -1;

            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                return binarySearchRecursive(arr, low, mid - 1, key);
            else
                return binarySearchRecursive(arr, mid + 1, high, key);
        }

        public static void main(String[] args) {

            int[] arr = {2, 8, 6, 8, 10, 12};
            int key = 8;

            int result1 = binarySearchIterative(arr, key);
            System.out.println("Iterative Search Index: " + result1);

            int result2 = binarySearchRecursive(arr, 0, arr.length - 1, key);
            System.out.println("Recursive Search Index: " + result2);
        }
    }

