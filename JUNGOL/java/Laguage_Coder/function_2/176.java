
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void result(double a, double b) {
        int cnt = 0;
        if (a > b) {
            for (int i = (int) Math.ceil(Math.sqrt(b)); i <= (int) Math.sqrt(a); i++) {
                cnt++;
            }
            System.out.println(cnt);
        } else {
            for (int i = (int) Math.ceil(Math.sqrt(a)); i <= (int) Math.sqrt(b); i++) {
                cnt++;
            }
            System.out.println(cnt);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        result(a, b);

        scanner.close();
    }
}