
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void recall(int min, int n) {
        if (min <= n) {
            System.out.print(min + " ");
            min += 2;
            recall(min, n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int min = 0;

        if (n % 2 != 0) {
            min = 1;
        } else {
            min = 2;
        }

        recall(min, n);

        scanner.close();
    }
}