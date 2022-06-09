
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char target = scanner.next().charAt(0);
        scanner.close();

        if (str.indexOf(target) != -1) {
            System.out.println(str.indexOf(target));
        } else {
            System.out.println("No");
        }

    }
}