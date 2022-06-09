
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int[] arr = new int[50];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 3; i <= 50; i++) {
            arr[i - 1] = arr[(i / 2) - 1] + arr[i - 2];
            if (i == n) {
                System.out.println(arr[i - 1]);
            }
        }
    }
}