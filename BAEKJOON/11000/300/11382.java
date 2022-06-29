
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            sum += scanner.nextLong();
        }
        scanner.close();
        System.out.println(sum);
    }
}