
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder str = new StringBuilder(scanner.next());

        while (true) {
            int n = scanner.nextInt();

            if (str.length() >= n) {
                str.deleteCharAt(n - 1);
            } else {
                str.deleteCharAt(str.length() - 1);
            }

            System.out.println(str);

            if (str.length() == 1) {
                break;
            }
        }

        scanner.close();
    }
}