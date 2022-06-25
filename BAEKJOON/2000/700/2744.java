
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String original = scanner.next();
            scanner.close();

            String ans = "";

            for (int i = 0; i < original.length(); i++) {
                  if (original.charAt(i) >= 'a' && original.charAt(i) <= 'z') {
                        ans += (char) (original.charAt(i) - 32);
                  } else {
                        ans += (char) (original.charAt(i) + 32);
                  }
            }

            System.out.println(ans);
      }
}