
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        if (str.indexOf('c') != -1) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (str.indexOf("ab") != -1) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        scanner.close();
    }
}