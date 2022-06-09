
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);

        System.out.printf("%d %d", a + b, ((a > b) ? (a - b) : (b - a)));

        scanner.close();
    }
}