public class HeapSort {
      public static void main(String[] args) {
            int[] arr = { 81, 89, 9, 11, 14, 76, 54, 22 };

            sort(arr);

            printResult(arr);
      }

      private static void sort(int[] arr) {
            int size = arr.length; // The size of unarranged tree

            // Build max heap
            for (int i = size / 2 - 1; i >= 0; i--) {
                  heapify(arr, size, i);
            }

            // Heap sort
            for (int i = size - 1; i >= 0; i--) {
                  int temp = arr[0];
                  arr[0] = arr[i];
                  arr[i] = temp;

                  // Heapify root element
                  heapify(arr, i, 0);
            }
      }

      private static void heapify(int[] arr, int size, int i) {
            // i : root point
            int root = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && arr[left] > arr[root]) {
                  root = left;
            }

            if (right < size && arr[right] > arr[root]) {
                  root = right;
            }

            if (root != i) { // The root value is not the peek value
                  // swapping
                  int temp = arr[i];
                  arr[i] = arr[root];
                  arr[root] = temp;

                  heapify(arr, size, root);
            }
      }

      private static void printResult(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }
}
