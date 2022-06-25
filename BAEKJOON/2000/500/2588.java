
// For Algorithm submit template
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            String b = scanner.next();
            scanner.close();

            List<Integer> list = new ArrayList<Integer>();
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                  list.add(a * (b.charAt(i) - '0'));
                  sum += a * (b.charAt(i) - '0');
                  sum *= 10;
            }
            sum /= 10;

            for (int i = list.size() - 1; i >= 0; i--) {
                  System.out.println(list.get(i));
            }

            System.out.println(sum);
      }
}