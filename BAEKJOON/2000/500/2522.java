
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                  }
                  for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
            for (int i = 0; i < n - 1; i++) {
                  for (int j = 0; j <= i; j++) {
                        System.out.print(" ");
                  }
                  for (int j = 0; j < n - 1 - i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }

            scanner.close();
      }
}