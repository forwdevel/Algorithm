
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.close();

        double sum = 0;
        int ten = 1;

        for (int i = target; i > 0; i /= 10) {
            System.out.println(num * (i % 10));
            sum += num * (i % 10);
            sum /= (double) 10;
            ten *= 10;
        }
        System.out.println((int) (ten * sum));
    }
}