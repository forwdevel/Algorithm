
// For Algorithm submit template
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str_1 = scanner.next();
        int before = str_1.length();
        String str_2 = scanner.next();
        int n = scanner.nextInt();

        str_1 += str_2;

        // 수정
        // been schooling 10

        if (n <= before) {
            str_2 = str_1.substring(0, n) + str_2.substring(n, str_2.length());
        } else if (n >= str_2.length()) {
            str_2 = str_1.substring(0, n);
        } else {
            str_2 = str_1.substring(0, n) + str_2.substring(n, str_2.length());
        }

        System.out.println(str_1);
        System.out.println(str_2);

        scanner.close();
    }
}