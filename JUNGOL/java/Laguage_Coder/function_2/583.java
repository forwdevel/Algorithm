
// For Algorithm submit template
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void sortNprdouble(double[] arr) {
        Arrays.sort(arr);

        System.out.print((int) Math.ceil(arr[2]) + " ");
        System.out.print((int) Math.floor(arr[0]) + " ");
        System.out.println((int) Math.round(arr[1]));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextDouble();
        }

        sortNprdouble(arr);

        scanner.close();
    }
}