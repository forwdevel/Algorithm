
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  if (i % 2 != 0) {
                        // odd
                        System.out.print(" ");
                  }
                  for (int j = 0; j < n; j++) {
                        System.out.print("* ");
                  }
                  System.out.println();
            }

            scanner.close();
      }
}