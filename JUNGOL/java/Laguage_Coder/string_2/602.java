
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[5];

        for (int i = 4; i >= 0; i--) {
            str[i] = scanner.next();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(str[i]);
        }

        scanner.close();
    }
}