
// For Algorithm submit template
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] arr = { 4, 4, 4, 3, 3 };
            int before = arr[0];

            List<Integer> temp = new ArrayList<Integer>();
            temp.add(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                  if (i > 0) {
                        if (before != arr[i]) {
                              temp.add(arr[i]);
                              before = arr[i];
                        }
                  }
            }

            int[] answer = new int[temp.size()];

            for (int i = 0; i < temp.size(); i++) {
                  answer[i] = temp.get(i);
            }

            scanner.close();
      }
}