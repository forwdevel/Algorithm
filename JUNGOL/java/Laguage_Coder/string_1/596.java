
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int n = scanner.nextInt();
        scanner.close();

        for (int i = str.length() - 1; i >= str.length() - ((n > str.length()) ? str.length() : (n)); i--) {
            System.out.print(str.charAt(i));
        }

    }
}