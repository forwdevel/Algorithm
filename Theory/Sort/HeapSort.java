// [ Heap Sort ]
// >> This is a popular and 'efficient' sorting algorithm in computer programming
// >> Heap sort works by visualizing the elements of the array as a special kind
//    of complete binary tree called a heap.
// >> Note : As a prerequisite, you must know about a complete binary tree and
//    heap data structure.

// -----------------------------------------------------------------------------------------

// [ Relationship between Array Indexes and Tree Elements ]
// >> A complete binary tree has an interesting property that we can use to find the
//    children and parents of any node.
// >> If the index of any element in the array is 'i', the element in the index '2i + 1' will
//    become the left child and eleemnt in '2i + 2' index will become the right child.
//    Also, the parent of any eleemnt at index 'i' is given by the lower bound of '(i-1)/2'.

// -----------------------------------------------------------------------------------------

// [ What is Heap Data Structure? ]
// >> Heap is a special tree-based data structure. A binary tree is said to follow 
//    a heap data structure if :
//    >> It is a complete binary tree
//    >> All nodes in the tree follow the property that they are greater than their
//    >> children i.e. the largest element is at the root and both its children and 
//    >> smaller than the root and so on. Such a heap is called a max-heap. If instead,
//    >> all nodes are smaller than their children, it is called a min-heap.

// -----------------------------------------------------------------------------------------

// [ Working of Heap Sort ]
// >> 1. Since the tree satisfies Max-Heap property, then the largest item is stored at
//    the root node.
// >> 2. Swap: Remove the root element and put at the end of the array (nth position)
//    Put the last itemp of the tree (heap) at the vacant place.
// >> 3. Remove: Reduce the size of the heap by 1.
// >> 4. Heapify: Heapify the root element again so that we have the hightest 
//    element at root.
// >> 5. The process is repeated until all the itemsof the list are sorted.

// -----------------------------------------------------------------------------------------

// Heap Sort in Java
public class HeapSort {
      public void sort(int arr[]) {
            int n = arr.length;

            // Build max heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                  heapify(arr, n, i);
            }

            // Heap sort
            for (int i = n - 1; i >= 0; i--) {
                  int temp = arr[0];
                  arr[0] = arr[i];
                  arr[i] = temp;

                  // Heapify root element
                  heapify(arr, i, 0);
            }
      }

      void heapify(int arr[], int n, int i) {
            // Find largest among root, left child and right child
            int largest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;

            if (l < n && arr[l] > arr[largest]) {
                  largest = l;
            }

            if (r < n && arr[r] > arr[largest]) {
                  largest = r;
            }

            // Swap and continue heapifying if root is not largest
            if (largest != i) {
                  int swap = arr[i];
                  arr[i] = arr[largest];
                  arr[largest] = swap;

                  heapify(arr, n, largest);
            }
      }

      static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }

      public static void main(String[] args) {
            int arr[] = { 1, 12, 9, 5, 6, 10 };

            HeapSort hs = new HeapSort();
            hs.sort(arr);
            System.out.println("Sorted array is ");
            printArray(arr);
      }
}
