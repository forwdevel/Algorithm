public class Combination {
      public static void main(String[] args) {
            int[] arr = { 1, 2, 3 };
            boolean[] visited = new boolean[arr.length];

            for (int i = 1; i <= arr.length; i++) {
                  System.out.println("Select" + i + "thing of " + arr.length);
                  combination(arr, visited, 0, i);
            }
      }

      public static void combination(int[] arr, boolean[] visited, int depth, int r) {
            if (r == 0) {
                  print(arr, visited);
                  return;
            }
            if (depth == arr.length) {
                  return;
            } else {
                  visited[depth] = true;
                  combination(arr, visited, depth + 1, r - 1);

                  visited[depth] = false;
                  combination(arr, visited, depth + 1, r);
            }
      }

      public static void print(int[] arr, boolean[] visited) {
            for (int i = 0; i < arr.length; i++) {
                  if (visited[i] == true) {
                        System.out.print(arr[i] + " ");
                  }
            }
            System.out.println();
      }
}