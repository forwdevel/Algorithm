
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            int target = scanner.nextInt();
            scanner.close();

            if (minute + target < 60) {
                  System.out.println(hour + " " + (target + minute));
            } else {
                  if ((hour + (target + minute) / 60) > 23) {
                        System.out.println((hour + (target + minute) / 60 - 24) + " " + (target + minute) % 60);
                  } else {
                        System.out.println((hour + (target + minute) / 60) + " " + (target + minute) % 60);
                  }

            }

      }
}