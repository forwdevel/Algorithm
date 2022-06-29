
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        scanner.close();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'c':
                    try {
                        if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                            i++;
                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                    cnt++;
                    break;
                case 'd':
                    try {
                        if (str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                            i += 2;
                        }
                        if (str.charAt(i + 1) == '-') {
                            i++;
                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                    cnt++;
                    break;
                case 'l':
                case 'n':
                    try {
                        if (str.charAt(i + 1) == 'j') {
                            i++;
                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                    cnt++;
                    break;
                case 's':
                case 'z':
                    try {
                        if (str.charAt(i + 1) == '=') {
                            i++;
                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                    cnt++;
                    break;
                default:
                    cnt++;
                    break;
            }
        }
        System.out.println(cnt);

    }
}