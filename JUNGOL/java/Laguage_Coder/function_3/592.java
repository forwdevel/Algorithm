
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void recall(int n, int sum) {
        if (n / 10 == 0 && n % 10 == 0) {
            System.out.println(sum);
        } else {
            sum += (n % 10) * (n % 10);
            n /= 10;
            recall(n, sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        recall(n, 0);

        scanner.close();
    }
}