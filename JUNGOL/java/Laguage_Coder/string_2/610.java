// For Algorithm submit template
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[5];

        for(int i = 0; i < 5; i++){
            str[i] = scanner.next();
        }

        Arrays.sort(str, Collections.reverseOrder() );

        for(int i = 0; i < 5; i++){
            System.out.println(str[i]);
        }

        scanner.close();
    }
}