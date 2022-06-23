
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            scanner.close();
            String str = "" + Integer.toBinaryString(n);
            String ans = "";

            for (int i = 0; i < str.length(); i++) {
                  ans += str.charAt(str.length() - i - 1);
            }

            System.out.println(Integer.parseInt(ans, 2));

      }
}