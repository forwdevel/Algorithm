
// For Algorithm submit template
import java.util.Scanner;

class Main {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            My_Stack stack = new My_Stack();
            StringBuilder sb = new StringBuilder();

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                  String command = scanner.next();
                  switch (command) {
                        case "push":
                              stack.push(scanner.nextInt());
                              break;
                        case "pop":
                              sb.append(stack.pop()).append('\n');
                              break;
                        case "size":
                              sb.append(stack.size()).append('\n');
                              break;
                        case "empty":
                              sb.append(stack.empty()).append('\n');
                              break;
                        case "top":
                              sb.append(stack.top()).append('\n');
                              break;
                        default:
                              break;
                  }
            }
            System.out.println(sb);
            scanner.close();
      }

}

class My_Stack {
      int size = 0;
      private int[] arr = new int[10000];

      public void push(int n) {
            arr[size] = n;
            size++;
      }

      public int pop() {

            if (size == 0) {
                  return -1;
            }
            return arr[size-- - 1];
      }

      public int size() {
            return size;
      }

      public int empty() {
            if (size == 0) {
                  return 1;
            }
            return 0;

      }

      public int top() {
            if (size == 0) {
                  return -1;
            }
            return arr[size - 1];
      }
}