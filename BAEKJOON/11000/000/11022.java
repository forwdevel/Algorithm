
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            StringBuilder sb = new StringBuilder();
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  int a = scanner.nextInt();
                  int b = scanner.nextInt();

                  sb.append("Case #").append(i + 1).append(": ").append(a).append(" + ").append(b).append(" = ")
                              .append(a + b).append("\n");
            }
            scanner.close();

            System.out.println(sb);
      }
}