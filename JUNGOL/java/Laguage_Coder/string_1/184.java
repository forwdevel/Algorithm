
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        scanner.close();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += (char) (str.charAt(i) + 32);
            } else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    || ((str.charAt(i) >= '0' && str.charAt(i) <= '9'))) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);

    }
}