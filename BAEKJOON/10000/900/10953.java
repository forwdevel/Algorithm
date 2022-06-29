
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            String[] arr = a.split(",");
            System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        }
        scanner.close();
    }
}