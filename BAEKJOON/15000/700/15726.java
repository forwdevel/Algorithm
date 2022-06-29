
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if ((a * b / c) > (a / c * b)) {
            System.out.println(a * b / c);
        } else {
            System.out.println(a / c * b);
        }

    }
}