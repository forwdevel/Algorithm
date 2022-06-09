
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(str.length() - 1);
            str = "" + temp + str.substring(0, str.length() - 1);
            System.out.println(str);
        }

        scanner.close();
    }
}