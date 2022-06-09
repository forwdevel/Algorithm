
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void result(double sum) {
        System.out.println(Math.round((double) sum / 3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[3];
        double fisrtSum = 0;
        double secondSum = 0;

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextDouble();
            fisrtSum += arr[i];
            secondSum += Math.round(arr[i]);
        }

        result(fisrtSum);
        result(secondSum);

        scanner.close();
    }
}