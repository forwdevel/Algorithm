
// For Algorithm submit template
import java.util.Scanner;
import java.util.Stack;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Stack<Integer> stack = new Stack<Integer>();

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  int a = scanner.nextInt();
                  if (a == 0) {
                        stack.pop();
                  } else {
                        stack.push(a);
                  }
            }
            scanner.close();

            int sum = 0;

            if (stack.size() == 0) {
                  System.out.println(0);
            } else {
                  n = stack.size();
                  for (int i = 0; i < n; i++) {
                        sum += stack.pop();
                  }
                  System.out.println(sum);
            }
      }
}