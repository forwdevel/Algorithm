
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.close();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                  sum += i + 1;
            }
            System.out.println(sum);
      }
}