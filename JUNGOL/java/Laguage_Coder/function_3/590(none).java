
// For Algorithm submit template
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] result = new int[n][];

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    result[i + j + k - 3][0] = i;
                    result[i + j + k - 3][1] = j;
                    result[i + j + k - 3][2] = k;
                }
            }
        }

        scanner.close();
    }
}