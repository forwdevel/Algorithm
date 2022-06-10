
// For Algorithm submit template
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[3];

        for (int i = 0; i < 3; i++) {
            str[i] = scanner.next();
        }

        Arrays.sort(str);

        System.out.println(str[0]);

        scanner.close();
    }
}