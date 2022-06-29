
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scanner.nextInt();
            }
            if (max < sum) {
                max = sum;
            }
        }
        scanner.close();
        System.out.println(max);
    }
}