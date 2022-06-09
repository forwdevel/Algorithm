
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[100];
        int n = scanner.nextInt();
        scanner.close();

        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < n; i++) {
            arr[i] = (arr[i - 2] * arr[i - 1]) % 100;
            if (n - 1 == i) {
                System.out.println(arr[i]);
                break;
            }
        }
        if (n - 1 == 1) {
            System.out.println(arr[1]);
        } else if (n - 1 == 0) {
            System.out.println(arr[0]);
        }
    }
}