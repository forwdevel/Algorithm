
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static int logic(int n) {
        int a = n % 10;
        a *= 10;
        a += (n % 10 + n / 10) % 10;
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int original = scanner.nextInt();
        scanner.close();

        int n = logic(original);

        int cnt = 1;

        while (original != n) {
            n = logic(n);
            cnt++;
        }
        System.out.println(cnt);
    }
}