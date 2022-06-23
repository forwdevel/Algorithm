
// For Algorithm submit template
import java.util.Scanner;
import java.util.Stack;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Stack<Character> stack = new Stack<Character>();
            StringBuffer sb = new StringBuffer();

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  String str = scanner.next();

                  for (int j = 0; j < str.length(); j++) {
                        if (!stack.isEmpty() && str.charAt(j) == ')' && stack.peek() == '(') {
                              stack.pop();
                        } else {
                              stack.push(str.charAt(j));
                        }
                  }
                  if (stack.size() == 0) {
                        sb.append("YES\n");
                  } else {
                        sb.append("NO\n");
                  }
                  stack.clear();
            }
            System.out.println(sb);
            scanner.close();
      }
}