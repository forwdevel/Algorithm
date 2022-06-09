
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            char i = scanner.next().charAt(0);
            if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                System.out.println(i);
            } else if (i >= '0' && i <= '9') {
                System.out.println((int) i);
            } else {
                break;
            }

        }

        scanner.close();
    }
}