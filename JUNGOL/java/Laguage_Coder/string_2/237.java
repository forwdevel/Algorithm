
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        double realNum = scanner.nextDouble();
        String str = scanner.next();

        str = "" + integer + Math.round(realNum * 1000) / 1000.0 + str;

        if (str.length() % 2 != 0) {
            // odd
            System.out.println(str.substring(0, str.length() / 2 + 1));
            System.out.println(str.substring(str.length() / 2 + 1, str.length()));
        } else {
            // even
            System.out.println(str.substring(0, str.length() / 2));
            System.out.println(str.substring(str.length() / 2, str.length()));
        }

        scanner.close();
    }
}