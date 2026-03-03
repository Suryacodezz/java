package Module_7;

    class Pair {
        int value;
        char id;

        Pair(int value, char id) {
            this.value = value;
            this.id = id;
        }
    }

public class Question9 {

        static void bubbleSort(Pair[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j].value > arr[j + 1].value) {
                        Pair temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        static void selectionSort(Pair[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int min = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j].value < arr[min].value) {
                        min = j;
                    }
                }

                Pair temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        static void printArray(Pair[] arr) {
            for (Pair p : arr) {
                System.out.print("(" + p.value + "," + p.id + ") ");
            }
            System.out.println();
        }

        public static void main(String[] args) {

            Pair[] arr1 = {
                    new Pair(5,'A'),
                    new Pair(3,'B'),
                    new Pair(5,'C'),
                    new Pair(2,'D')
            };

            Pair[] arr2 = {
                    new Pair(5,'A'),
                    new Pair(3,'B'),
                    new Pair(5,'C'),
                    new Pair(2,'D')
            };

            bubbleSort(arr1);
            System.out.print("Bubble Sort (Stable): ");
            printArray(arr1);

            selectionSort(arr2);
            System.out.print("Selection Sort (Unstable): ");
            printArray(arr2);
        }

}
