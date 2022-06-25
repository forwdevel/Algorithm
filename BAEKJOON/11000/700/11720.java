
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            String str = scanner.next();
            scanner.close();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                  sum += str.charAt(i) - '0';
            }
            System.out.println(sum);
      }
}