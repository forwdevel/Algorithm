// Bubble Sort

// >> This is a sorting algorithm that compares two adjacent elements and
// swaps them until they are not in the intended order.
// >> Just like the movement of air bubbles in the water that rise up
// to the surface, each element of the array move to the end in each iteration,

// ---------------------------------------------------------------------------------------

// Working of Bubble Sort

// [Ascending order]
// >> 1. Starting from the 'First Index', compare the first and 'the second'
// elements.
// >> 2. If the first element is greater than the second element they are
// swapped.
// >> 3. Now, compare the second and the third elements. Swap them if they are
// not
// in order.
// >> 4. The above process goes on until the last element.

// ---------------------------------------------------------------------------------------

// Time Complexities
// >> Worst Case Complexity : O(n^2)
// >> Best Case Complexity : O(n)
// >> Average Case Complexity : O(n^2)

// Space Complexity
// >> Common : O(1)
// >> Optimized : O(2)

// ---------------------------------------------------------------------------------------

// Bubble sort in Java
import java.util.Arrays;

public class BubbleSort {
      // Optimized Bubble Sort
      static void bubblesortOptimized(int array[]) {
            int size = array.length;

            // Loop to access each array element
            for (int i = 0; i < (size - 1); i++) {
                  // Check if swapping occurs
                  boolean swapped = false;

                  // Loop to compare adjacent elements
                  for (int j = 0; j < (size - i - 1); j++) {
                        // Compare two array elements
                        if (array[j] > array[j + 1]) {
                              // Swapping occurs if elements
                              int temp = array[j];
                              array[j] = array[j + 1];
                              array[j + 1] = temp;

                              // Checl the swapping
                              swapped = true;
                        }
                  }

                  // No swapping means the array is already sorted
                  // So, no need for further comparison
                  if (!swapped)
                        break;
            }
      }

      // Perform the bubble sort
      static void bubblesortCommon(int array[]) {
            int size = array.length;

            // Loop to access each array element
            for (int i = 0; i < size - 1; i++) {
                  // Loop to compare array elements
                  for (int j = 0; j < size - i - 1; j++) {
                        // Compare two adjacent elements
                        if (array[j] > array[j + 1]) {
                              // swqpping occurs if elements
                              // are not in the intended order
                              int temp = array[j];
                              array[j] = array[j + 1];
                              array[j + 1] = temp;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            int[] data = { -2, 45, 0, 11, -9 };

            // Call method using class name
            BubbleSort.bubblesortOptimized(data);

            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(data));
      }

}