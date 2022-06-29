
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        scanner.close();
        System.out.println(sum);
    }
}