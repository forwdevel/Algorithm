
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void recall(int n, int cnt) {
        if (n != 1) {
            if (n % 2 == 0) { // even
                n /= 2;
            } else {// odd
                n /= 3;
            }
            recall(n, ++cnt);
        } else {
            System.out.println(cnt);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        recall(n, 0);

        scanner.close();
    }
}