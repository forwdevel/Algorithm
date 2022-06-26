
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int a = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < a; i++) {
            int x = scanner.nextInt();
            int[] arr = new int[x];
            sum = 0;
            for (int j = 0; j < x; j++) {
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }
            int avg = sum / x;
            sum = 0;
            for (int j = 0; j < x; j++) {
                if (avg < arr[j]) {
                    sum++;
                }
            }
            System.out.printf("%.3f%%\n", Math.round((double) sum / x * 100 * 1000) / 1000.0);
        }
        scanner.close();
    }
}