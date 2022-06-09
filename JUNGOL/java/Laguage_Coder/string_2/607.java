
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str_1 = scanner.next();
        String str_2 = scanner.next();

        str_2 = str_2.substring(2, str_2.length());
        str_2 += str_1.substring(0, 2);
        str_2 = str_1.substring(0, 2) + str_2;

        System.out.println(str_2);

        scanner.close();
    }
}