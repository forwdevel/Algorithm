
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void center(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.printf("(%.1f, %.1f)", ((double) x1 + x2 + x3) / 3, ((double) y1 + y2 + y3) / 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        center(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt());

        scanner.close();
    }
}