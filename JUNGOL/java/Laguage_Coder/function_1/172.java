
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void printing(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printing(n);

        scanner.close();
    }
}