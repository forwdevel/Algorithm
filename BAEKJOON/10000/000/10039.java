
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int avg = 0;

        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if (n < 40) {
                avg += 40;
            } else {
                avg += n;
            }
        }

        scanner.close();

        avg /= 5;
        System.out.println(avg);
    }
}