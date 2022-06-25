
// For Algorithm submit template
import java.util.Scanner;
import java.util.Stack;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            Stack<Character> stack = new Stack<Character>();

            while (true) {
                  String str = scanner.nextLine();
                  if (str.length() == 1 && str.charAt(0) == '.') {
                        break;
                  }

                  for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                              stack.push(str.charAt(i));
                        } else if (!stack.isEmpty() && str.charAt(i) == ')' && stack.peek() == '(') {
                              stack.pop();
                        } else if (!stack.isEmpty() && str.charAt(i) == ']' && stack.peek() == '[') {
                              stack.pop();
                        } else if (str.charAt(i) == ')' || str.charAt(i) == ']') {
                              stack.push(str.charAt(i));
                        }
                  }

                  if (stack.size() != 0) {
                        sb.append("no\n");
                        stack.clear();
                  } else {
                        sb.append("yes\n");
                  }
            }
            System.out.println(sb);
            scanner.close();
      }
}