
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void recall(int n, int cnt) {
        if (cnt < n) {
            System.out.print(n + " ");
            recall(--n, cnt);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        recall(n, 0);

        scanner.close();
    }
}