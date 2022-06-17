
public class BinarySearchTest {
      public static int binarySearch(int[] arr, int target, int left, int right) {
            if (left <= right) {
                  int mid = left + (left + right) / 2; // Set mid idx

                  // Found
                  if (arr[mid] == target) {
                        return mid;
                  }

                  if (arr[mid] > target) {
                        return binarySearch(arr, target, 0, mid - 1);
                  } else {
                        return binarySearch(arr, target, mid + 1, arr.length - 1);
                  }
            }

            // Not Found
            return -1;
      }

      public static void main(String[] args) {
            // It must be needed to sort at first.
            int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

            int target = 4;

            int idx = binarySearch(arr, target, 0, arr.length - 1);
            System.out.println("It is located by index : " + idx);
      }
}
