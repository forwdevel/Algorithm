
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0) {
            if (y > 0) {
                // x : positive, y : positive
                System.out.println(1);
            } else {
                // x : positive , y : negative
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                // x : negative, y : positive
                System.out.println(2);
            } else {
                // x : negative, y : negative
                System.out.println(3);
            }
        }

        scanner.close();
    }
}