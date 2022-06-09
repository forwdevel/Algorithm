
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        str = str.substring(0, 5);
        System.out.println(str);

        scanner.close();
    }
}