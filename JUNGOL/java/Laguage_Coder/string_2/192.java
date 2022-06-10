// For Algorithm submit template
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] str = new String[n];

        for(int i = 0; i < str.length; i++){
            str[i] = scanner.next();
        }

        Arrays.sort(str);

        for(int i = 0; i < str.length; i++){
           System.out.println(str[i]);
        }

        scanner.close();
    }
}