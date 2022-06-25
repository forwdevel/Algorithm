
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            StringBuilder sb = new StringBuilder();

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  int a = scanner.nextInt() + scanner.nextInt();
                  sb.append("Case #").append(i + 1).append(": ").append(a).append("\n");
            }

            System.out.println(sb);

            scanner.close();
      }
}