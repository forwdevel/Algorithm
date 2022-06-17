// Selection Sort
// >> This is a sorting algorithm that selects the smallest element from an
// unsorted list in each iteration and places that element at the begginning of
// the unsorted list.
// >> https://www.programiz.com/dsa/selection-sort

// ---------------------------------------------------------------------------------------

// Working of Selection Sort
// >> 1. Set the first element as minimum.
// >> 2. Compare 'minimum' with the second element as 'minimum'.
// >> 3. After each iteration, 'minimum' is placed in the front of the unsorted
// list.
// >> 4. For each iteration, indexing starts from the first unsorted element.
// Step 1 to 3 are repeated until all the elements are placed at their correct
// positions.

// ---------------------------------------------------------------------------------------

// Complexity

// Time Complexity
// >> Best : O(n^2)
// >> Worst : O(n^2)
// >> Average : O(n^2)
// Space Complexity : O(1)
// Stability : No

// ---------------------------------------------------------------------------------------

// Selection sort in java

import java.util.Arrays;

public class SelectionSort {
      void selectionSort(int array[]) {
            int size = array.length;

            for (int step = 0; step < size - 1; step++) {
                  int min_idx = step;

                  for (int i = step + 1; i < size; i++) {
                        // To sort in descending order.
                        // Select the minimum element in each loop.
                        if (array[i] < array[min_idx]) {
                              min_idx = i;
                        }
                  }

                  // Put min at the correct position
                  int temp = array[step];
                  array[step] = array[min_idx];
                  array[min_idx] = temp;
            }
      }

      public static void main(String[] args) {
            int[] data = { 20, 12, 10, 15, 2 };
            SelectionSort ss = new SelectionSort();
            ss.selectionSort(data);

            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(data));
      }
}