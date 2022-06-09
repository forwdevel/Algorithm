
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(squared(n));

        scanner.close();
    }

    private static int squared(int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= 2;
        }
        return sum;
    }
}