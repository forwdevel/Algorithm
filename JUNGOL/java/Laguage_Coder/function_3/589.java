
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void recall(int n, int cnt, int sum) {
        if (cnt < n) {
            sum += (cnt + 1);
            recall(n, ++cnt, sum);
        } else {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        recall(n, 0, 0);

        scanner.close();
    }
}