
// For Algorithm submit template
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> list = new ArrayList<Integer>();
            List<Integer> temp = new ArrayList<Integer>();

            int sum = 0;

            for (int i = 0; i < 9; i++) {
                  int n = scanner.nextInt();
                  list.add(n);
            }
            scanner.close();

            while (true) {
                  temp.addAll(list);
                  int a = (int) (Math.random() * 9);
                  int b = (int) (Math.random() * 9);

                  if (a == b) {
                        continue;
                  }

                  if (a > b) {
                        temp.remove(a);
                        temp.remove(b);
                  } else {
                        temp.remove(b);
                        temp.remove(a);
                  }

                  for (int i = 0; i < 7; i++) {
                        sum += temp.get(i);
                  }

                  if (sum != 100) {
                        sum = 0;
                        temp.clear();
                  } else {
                        break;
                  }
            }
            for (int i = 0; i < 7; i++) {
                  System.out.println(temp.get(i));
            }
      }
}