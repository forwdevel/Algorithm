
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("ASCII code =? ");
            char i = (char) scanner.nextInt();

            if (i < 33 || i > 127) {
                break;
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}