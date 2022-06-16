
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.close();
            String third = "";
            int sum = 0;
            int grade = 1;

            while (n > 0) {
                  third += n % 3;
                  n /= 3;
            }

            for (int i = third.length() - 1; i >= 0; i--) {
                  sum += (third.charAt(i) - '0') * grade;
                  grade *= 3;
            }

            System.out.println(sum);
      }
}