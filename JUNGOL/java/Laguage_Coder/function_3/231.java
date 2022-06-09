
// For Algorithm submit template
import java.util.Scanner;
import java.util.Stack;

class Main {
    static Stack<Integer> stack = new Stack<>();

    public static void recall(int n) {
        if (n > 0) {
            stack.push(n);
            n /= 2;
            recall(n);
        } else {
            while (!stack.empty()) {
                System.out.print(stack.peek() + " ");
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        recall(n);

        scanner.close();
    }
}