
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        scanner.close();

        if (one == two && two == three) {
            System.out.println(10000 + one * 1000);
        } else if (one == two || two == three) {
            System.out.println(1000 + two * 100);
        } else if (one == three) {
            System.out.println(1000 + one * 100);
        } else {
            if (one > two && one > three) {
                System.out.println(one * 100);
            } else if (two > one && two > three) {
                System.out.println(two * 100);
            } else {
                System.out.println(three * 100);
            }
        }
    }
}