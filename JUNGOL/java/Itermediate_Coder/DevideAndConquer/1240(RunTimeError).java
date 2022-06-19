
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int max = 0;

        for (int i = 1; i * i <= n; i++) {
            max++;
        }

        System.out.println(max);

    }
}