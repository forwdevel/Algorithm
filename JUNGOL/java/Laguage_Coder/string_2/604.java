
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[10];

        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }

        char a = scanner.next().charAt(0);

        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(str[i].length() - 1) == a) {
                System.out.println(str[i]);
            }
        }

        scanner.close();
    }
}