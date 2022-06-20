import java.util.*;

class Solution {
      int min = 10000;

      public int minimumSum(int num) {
            int[] arr = new int[4];
            boolean[] visited = new boolean[4];
            int[] leftNright = new int[2];

            Solution temp2 = new Solution();

            List<Integer> temp = new ArrayList<Integer>();

            for (int i = 0; i < arr.length; i++) {
                  temp.add(num % 10);
                  num /= 10;
            }

            Collections.sort(temp);

            for (int i = 0; i < temp.size(); i++) {
                  arr[i] = temp.get(i);
            }

            // Select 2 and 2
            System.out.println("Select 2 thing\n");
            System.out.println("comb min test : " + temp2.comb(arr, visited, 0, 2, leftNright));
            if (temp2.min > temp2.comb(arr, visited, 0, 2, leftNright)
                        && temp2.comb(arr, visited, 0, 3, leftNright) != -1) {
                  temp2.min = temp2.comb(arr, visited, 0, 2, leftNright);
            }

            // Select 3 and 1
            System.out.println("Select 3 thing\n");
            if (temp2.min > temp2.comb(arr, visited, 0, 3, leftNright)
                        && temp2.comb(arr, visited, 0, 3, leftNright) != -1) {
                  temp2.min = temp2.comb(arr, visited, 0, 3, leftNright);
            }

            System.out.println("Result : " + temp2.min);

            return temp2.min;
      }

      public int comb(int[] arr, boolean[] visited, int depth, int r, int[] leftNright) {
            if (r == 0) {
                  for (int i = 0; i < arr.length; i++) {
                        if (visited[i] == true) {
                              // left
                              leftNright[0] += arr[i];
                              leftNright[0] *= 10;
                        } else {
                              // right
                              leftNright[1] += arr[i];
                              leftNright[1] *= 10;
                        }
                  }
                  leftNright[0] /= 10;
                  leftNright[1] /= 10;
                  System.out.println(leftNright[0] + " " + leftNright[1]);

                  if (min > leftNright[0] + leftNright[1]) {
                        min = leftNright[0] + leftNright[1];
                  }
                  leftNright[0] = 0;
                  leftNright[1] = 0;
                  System.out.println("min in comb: " + min);
                  return min;
            }

            if (depth == arr.length) {
                  System.out.println("It was worked");
                  return min;
            } else {
                  visited[depth] = true;
                  comb(arr, visited, depth + 1, r - 1, leftNright);
                  visited[depth] = false;
                  comb(arr, visited, depth + 1, r, leftNright);
            }

            return min;
      }
}