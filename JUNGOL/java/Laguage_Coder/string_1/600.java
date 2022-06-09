
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        scanner.close();

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 && str.charAt(0) != ' ') || (str.charAt(i) == ' ' && i != str.length() - 1)) {
                cnt++;
            }

        }
        System.out.println(cnt);

    }
}