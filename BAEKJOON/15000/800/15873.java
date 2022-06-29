
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        scanner.close();

        if (str.length() == 3) {
            if (str.charAt(1) == '0') {
                System.out.println(10 + str.charAt(2) - '0');
            } else {
                System.out.println(10 + str.charAt(0) - '0');
            }
        } else {
            System.out.println(str.charAt(0) - '0' + str.charAt(1) - '0');
        }
    }
}