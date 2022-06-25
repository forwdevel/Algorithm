
// For Algorithm submit template
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> temp = new ArrayList<Integer>();

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  temp.add(scanner.nextInt());
            }

            scanner.close();

            Collections.sort(temp);

            for (int i = 0; i < temp.size(); i++) {
                  System.out.println(temp.get(i));
            }
      }
}