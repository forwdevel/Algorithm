// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if(minute - 45 < 0){
            if(hour == 0){
                hour = 24;
            }
            System.out.printf("%d %d", hour-1, 60+(minute - 45));
        } else {
             System.out.printf("%d %d", hour, minute - 45);
        }

        scanner.close();
    }
}
