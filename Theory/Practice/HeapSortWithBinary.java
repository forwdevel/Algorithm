public class HeapSortWithBinary {
      public static void sort(int[] arr, int size) {
            for (int i = size / 2 - 1; i >= 0; i--) {
                  heapify(arr, size, i);
            }

            for (int i = size - 1; i >= 0; i--) {
                  int temp = arr[0];
                  arr[0] = arr[i];
                  arr[i] = temp;
                  heapify(arr, i, 0);
            }
      }

      public static void heapify(int[] arr, int size, int root) {
            int peek = root;
            int left = root * 2 + 1;
            int right = root * 2 + 2;

            if (left < size && arr[left] > arr[peek]) {
                  peek = left;
            }

            if (right < size && arr[right] > arr[peek]) {
                  peek = right;
            }

            if (peek != root) {
                  int temp = arr[peek];
                  arr[peek] = arr[root];
                  arr[root] = temp;

                  heapify(arr, size, peek);
            }
      }

      public static void binarySearch(int[] arr, int target, int left, int right) {
            if (left < right) {
                  int mid = left + (left + right) / 2;

                  if (arr[mid] == target) {
                        System.out.println("target(" + target + ") = idx(" + mid + ")");
                  } else if (target < arr[mid]) {
                        binarySearch(arr, target, left, mid - 1);
                  } else if (target > arr[mid]) {
                        binarySearch(arr, target, mid + 1, right);
                  }
            } else {
                  System.out.println(target + " is not found");
            }
      }

      public static void main(String[] args) {
            int[] arr = { 81, 89, 9, 11, 14, 76, 54, 22 };
            int size = arr.length;

            int[] target = { 15, 0, 11, 22 };
            int n = target.length;

            sort(arr, size);

            for (int i = 0; i < size; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < n; i++) {
                  binarySearch(arr, target[i], 0, size - 1);
            }

      }
}
