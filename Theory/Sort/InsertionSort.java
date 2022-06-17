// Insertion Sort
// This is a sorting algorithm that places an unsorted element at its suitable
// place in each iteration.
// Insertion sort works similarly as we sort cards in our hand in a card game.

// -------------------------------------------------------------------------------------

// Working of Insertion Sort
// >> 1. The first element in the array is assumed to be sorted. Take the second
// element and store it separately in 'key'. Compare key with te first element.
// if the first element is greater than 'key', then 'key' is placed in front of
// the first element.
// >> 2. Take the third element and compare it with the elements on the left of
// it. Placed it just behind the element smallar than it. If there is no element
// smaller than it, then place it at the beginning of the array.
// >> 3. Similarly, place every unsorted element at its correct position.

// -------------------------------------------------------------------------------------

// Complexity

// Time Complexity
// >> Best : O(n)
// >> Worst : O(n^2)
// >> Average : O(n^2)
// Space Complexity : O(1)
// Stability : Yes

// -------------------------------------------------------------------------------------

// Insertion Sort in Java

import java.util.Arrays;

public class InsertionSort {
      void insertionSort(int array[]) {
            int size = array.length;

            for (int step = 1; step < size; step++) {
                  int key = array[step];
                  int j = step - 1;

                  // Compare key with each element on the left of it until an element smaller than
                  // it is found.
                  // For descending order, chage key < array[j] to key > array[j].
                  while (j >= 0 && key < array[j]) {
                        array[j + 1] = array[j];
                        --j;
                  }

                  // Place key at after the element just smallert than it.
                  array[j + 1] = key;
            }
      }

      // Driver code
      public static void main(String args[]) {
            int[] data = { 9, 5, 1, 4, 3 };
            InsertionSort is = new InsertionSort();
            is.insertionSort(data);
            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(data));
      }
}