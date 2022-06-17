// Binary Search

// ------------------------------------------------------------------------------

// Working

// >> 1. Iterative Method
// >> 2. Recursive Method

// >> The recursive method follows 'the devide and conquer' approach.
// >> The general steps for both methods are discussed below.

// ------------------------------------------------------------------------------

// >> Algorithm to find the desired value in the state that the data is sorted.

// ------------------------------------------------------------------------------

// >> The most commonly used.
// >> Area required by many coding tests.
// >> Simple implementation and principle.
// >> Compare the median value of the target data with the value you want to find
// >> and find the target while reducing it by half.

// ------------------------------------------------------------------------------

// >> Function: Explore target data
// >> Features: Target reduction method through median comparison
// >> Time Complexity: O(log n)

// ------------------------------------------------------------------------------

// Search Process
// >> 1. Select the median value of the current dataset. (If odd, quotient devided
//          by 2, +1)
// >> 2. In case of median > target data, select left data set as the median.
// >> 3. In case of median < target data, select right data set as the median.
// >> 4. Repeat steps 1 to 3, and search ends when median == target data.

// ------------------------------------------------------------------------------

// Binary Search Complexity

// Time Complexities
// >> Best case complexity: O(1)
// >> Average case complexity: O(log n)
// >> Worst case complexity: O(log n)

// Space Complexity
// >> The space complexity of the binary search is O(1).

// ------------------------------------------------------------------------------

public class BinarySearch {
      // >> Iterative Method
      int binarySearchIterative(int array[], int x, int low, int high) {
            while (low <= high) {
                  int mid = low + (high - low) / 2; // Get the mid index

                  if (array[mid] == x) {
                        // Found
                        return mid;
                  }

                  if (array[mid] > x) {
                        // Search Right Side
                        low = mid + 1;
                  } else {
                        // Search Left Side
                        high = mid - 1;
                  }
            }

            return -1;
      }

      // >> Recursive Method
      int binarySearchRecursive(int array[], int x, int low, int high) {
            if (low <= high) {
                  int mid = low + (high - low) / 2;

                  // If found at mid, then return it
                  if (array[mid] == x) {
                        return mid;
                  }

                  // Search the left half
                  if (array[mid] > x) {
                        return binarySearchRecursive(array, x, low, mid - 1);
                  }

                  // Search the right half
                  return binarySearchRecursive(array, x, mid + 1, high);
            }

            return -1;
      }

      public static void main(String[] args) {
            // Declare and Create a Instance
            BinarySearch ob = new BinarySearch();

            int array[] = { 3, 4, 5, 6, 7, 8, 9 };
            int n = array.length; // The binarySearch method will be repeated at 0 to n -1;
            int x = 4; // Target Value
            int result = ob.binarySearchRecursive(array, x, 0, n - 1);
            if (result == -1) {
                  // Not Found
                  System.out.println("Not found");
            } else {
                  // Found
                  System.out.println("Element found at index " + result);
            }
      }
}

// ------------------------------------------------------------------------------
