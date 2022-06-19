
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
                        // Return statement is necessary
                        return binarySearch(arr, target, left, mid - 1);
                  }

                  if (target > arr[mid]) {
                        return binarySearch(arr, target, mid + 1, right);
                  }
            }

            return -1;
      }

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int arr_size = scanner.nextInt();
            int[] arr = new int[arr_size];

            for (int i = 0; i < arr_size; i++) {
                  arr[i] = scanner.nextInt();
            }

            int target_size = scanner.nextInt();
            int[] target = new int[target_size];

            for (int i = 0; i < target_size; i++) {
                  target[i] = scanner.nextInt();
                  System.out.print(binarySearch(arr, target[i], 0, arr_size - 1) + " ");
            }

            scanner.close();

      }
}