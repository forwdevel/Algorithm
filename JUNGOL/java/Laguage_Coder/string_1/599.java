
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    System.out.print((char) (str.charAt(i) - 32));
                } else {
                    System.out.print(str.charAt(i));
                }
            }
        }

        scanner.close();
    }
}