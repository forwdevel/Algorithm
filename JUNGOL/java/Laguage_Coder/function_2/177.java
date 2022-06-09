
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static int abs(int n) {
        if (n < 0) {
            return n * -1;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
            sum += abs(arr[i]);
        }
        System.out.println(sum);

        scanner.close();
    }
}