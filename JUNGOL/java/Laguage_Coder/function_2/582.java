
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void areaToRadius(int area) {
        System.out.printf("%.2f", Math.round((double) Math.sqrt((double) area / 3.14) * 100) / 100.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = scanner.nextInt();

        areaToRadius(area);

        scanner.close();
    }
}