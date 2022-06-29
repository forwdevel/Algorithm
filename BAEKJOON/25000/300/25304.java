
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            answer -= scanner.nextInt() * scanner.nextInt();
        }
        scanner.close();

        if (answer == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}