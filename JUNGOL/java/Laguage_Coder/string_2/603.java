
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        scanner.close();

        String temp = "";
        int cnt = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                if (cnt++ % 2 != 0) {
                    System.out.println(temp);
                }
                temp = "";
            }

        }
        if (cnt % 2 != 0) {
            System.out.println(temp);
        }

    }
}