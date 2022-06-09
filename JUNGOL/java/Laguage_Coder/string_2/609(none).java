
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp = "";
        String[] str = new String[3];

        for (int i = 0; i < 3; i++) {
            str[i] = scanner.next();
            if (i == 0) {
                temp = str[0];
            }

            if (temp.charAt(0) > str[i].charAt(0)) {
                temp = str[i];
            }
        }

        System.out.println(temp);

        scanner.close();
    }
}