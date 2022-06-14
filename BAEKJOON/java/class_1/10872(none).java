
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        long sum = n;

        for (int i = n - 1; i > 0; i--) {
            sum *= (long) i;
        }

        System.out.println(sum);

    }
}