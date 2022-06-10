
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "";

        while (true) {
            str = scanner.next();

            if (str.equals("END")) {
                scanner.close();
                System.exit(0);
            } else {
                StringBuilder temp = new StringBuilder();
                temp.append(str);
                temp.reverse();
                System.out.println(temp);
            }

        }

    }
}