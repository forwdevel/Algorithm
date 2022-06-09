
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public final static int SEVEN = 7;

    public static void sort(int[] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < SEVEN - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < SEVEN; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[SEVEN];

        for (int i = 0; i < SEVEN; i++) {
            arr[i] = scanner.nextInt();
        }

        sort(arr);

        scanner.close();
    }
}