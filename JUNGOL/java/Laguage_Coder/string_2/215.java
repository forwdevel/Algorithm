
// For Algorithm submit template
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = new String[2];
        String[] str = new String[2];

        str[0] = scanner.next();
        str[1] = scanner.next();
        temp[0] = "";
        temp[1] = "";
        scanner.close();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) >= '0' && str[i].charAt(j) <= '9') {
                    temp[i] += str[i].charAt(j);
                } else {
                    break;
                }
            }
        }
        System.out.println(Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]));

    }
}