
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void recall(String str, int result) {
        if (str != null && str.length() != 0) {
            if (str.charAt(0) != '0') {
                result *= (int) str.charAt(0) - 48;
            }
            if (str.length() != 1) {
                str = str.substring(1, str.length());
            } else {
                str = null;
            }
            recall(str, result);
        } else {
            System.out.println(result);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String str = "" + (long) (a * b * c);

        recall(str, 1);

        scanner.close();
    }
}