
// For Algorithm submit template
import java.util.Scanner;

class Main {
      private static int binarySearch(int[] arr, int target, int left, int right) {
            if (left <= right) {
                  int mid = left + (right - left) / 2;

                  if (arr[mid] == target) {
                        return mid;
                  }

                  if (target < arr[mid]) {
                        binarySearch(arr, target, left, mid - 1);
                  }

                  if (target > arr[mid]) {
                        binarySearch(arr, target, mid + 1, right);
                  }
            }

            return -1;
      }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int[] arr = new int[a];

            for (int i = 0; i < a; i++) {
                  arr[i] = scanner.nextInt();
            }

            int b = scanner.nextInt();
            int[] target = new int[b];

            for (int i = 0; i < b; i++) {
                  target[i] = scanner.nextInt();
            }

            scanner.close();

            // sort is needed (Heap)
            for (int i = 0; i < b; i++) {
                  System.out.print(binarySearch(arr, target[i], 0, b - 1) + " ");
            }

      }
}