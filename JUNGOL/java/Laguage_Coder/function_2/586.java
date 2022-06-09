
// For Algorithm submit template
import java.util.Scanner;

class Main {

    public static void calculate(int a, int b) {
        System.out.println("(" + a + " - " + b + ") ^ 2 = " + (a - b) * (a - b));
        System.out.println("(" + a + " + " + b + ") ^ 3 = " + (a + b) * (a + b) * (a + b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        calculate(a, b);

        scanner.close();
    }
}