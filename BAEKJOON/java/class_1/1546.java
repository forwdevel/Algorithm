
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxIdx = 0;
        double max = 0;
        double sum = 0;

        double[] score = new double[n];

        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
            if (score[i] > score[maxIdx]) {
                maxIdx = i;
            }
        }

        max = score[maxIdx];

        for (int i = 0; i < n; i++) {
            score[i] = score[i] / max * 100;
            sum += score[i];
        }

        System.out.println(
                Math.round(sum / n * 1000000) / 1000000.0);

        scanner.close();

    }
}