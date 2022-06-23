// [Merge Sort]
// >> This is one of 'the most popular' sorting algorithm that is based on the principle of 'Divide and Conquer Algorithm.'

// -------------------------------------------------------------------------------------

// [Devide and Conqur Strategy]
// >> Using the this technique, we divide a problem into subproblems.
// >> When the solutiom to each subproblem is ready, we 'combine' the results
// from the subproblems to solve the main problem.

// Divide
// >> If q is the half-way point between p and r, then we can split the subarrayA[p..r] in to two arrays A[p..q] and A[q+1, r].

// Conquer
// >> In the conquer step,we try tp sort both the subarrays A[p..q] and A[q+1, r]. If we haven't yet reached the base case, we again divide both these subarrays and try to sort them.

// Combine
// >> When the conquer step reaches the base step and we get two sorted
// subarrays A[p..q] and A[q+1, r] for array A[p..r], we combine the results by
// creating a sorted array A[p..r] form two sorted subarrays A[p..q] and A[q+1,
// r].

// -------------------------------------------------------------------------------------

// [ Writing the Code for Merge Algorithm ]
// 1. Create copies of the subarrays 'L <- A[p..q]' and 'M <- A[q+1,r]'.
// 2. Create three pointers i, j and k
// >> a. i maintains current index of L, starting at 1
// >> b. j maintains current index of M, starting at 1
// >> c. k maintains the current index of A[p..q], starting at p.
// 3. Until we reach the end of either 'L' or 'M', pick the larger among the
// elements from L and M and place them in the correct position at A[p..q]
// 4. When we run out of elements in either L or M, pick up the remaining
// elements and put in A[p..q].

// -------------------------------------------------------------------------------------

// [ Complexity ]
// Time Complexity
// >> Best : O(n * log n)
// >> Worst : O(n * log n)
// >> Average : O(n * log n)
// Space Complexity : O(n)
// Stability : Yes

// -------------------------------------------------------------------------------------

// Merge Sort in Java

public class MergeSort {
      // Merge two subarrays L and M into arr
      void merge(int arr[], int p, int q, int r) {
            // Create L <- A[p..q] and M <- A[q + 1..r]
            int n1 = q - p + 1;
            int n2 = r - q;

            int L[] = new int[n1];
            int M[] = new int[n2];

            for (int i = 0; i < n1; i++) {
                  L[i] = arr[p + i];
            }
            for (int j = 0; j < n2; j++) {
                  M[j] = arr[q + 1 + j];
            }

            // Maintain current index of sub-arrays and main array
            int i = 0, j = 0, k = p;

            // Until we reach either end of either L or M, pick larger among
            // elements L and M and place them in the correct position at A[p..r]
            while (i < n1 && j < n2) {
                  if (L[i] <= M[j]) {
                        arr[k] = L[i];
                        i++;
                  } else {
                        arr[k] = M[j];
                        j++;
                  }
                  k++;
            }

            // When we run out of elements in either L or M,
            // pick up the remaining elements and put in A[p..r]
            while (i < n1) {
                  arr[k] = L[i];
                  i++;
                  k++;
            }

            while (j < n2) {
                  arr[k] = M[j];
                  j++;
                  k++;
            }
      }

      // Divide the array into two subarrays, sort them and merge them
      void mergetSort(int arr[], int l, int r) {
            if (l < r) {
                  // m is the point where the array is divided into two subarrays
                  int m = (l + r) / 2;

                  mergetSort(arr, l, m);
                  mergetSort(arr, m + 1, r);

                  // merge the sorted subarrays
                  merge(arr, l, m, r);
            }
      }

      // Print the array
      static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }

      // Driver program
      public static void main(String[] args) {
            int arr[] = { 6, 5, 12, 10, 9, 1 };

            MergeSort ob = new MergeSort();
            ob.mergetSort(arr, 0, arr.length - 1);
            System.out.println("sorted array: ");
            printArray(arr);
      }
}