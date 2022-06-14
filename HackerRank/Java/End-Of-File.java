import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int cnt = 0;
        int[] max = new int[a];

        for (int i = 0; i < a; i++) {
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            char[][] temp = new char[width][height];

            for (int j = 0; j < width; j++) {
                for (int k = 0; k < height; k++) {
                    String str = scanner.next();

                    for (int l = 0; l < str.length(); l++) {
                        if (temp[j][k] == '#') {
                            cnt++;
                        }
                    }
                }
                if (cnt > max[j]) {
                    max[j] = cnt;
                }
            }
        }

        scanner.close();

        for (int i = 0; i < a; i++) {
            System.out.println(max[i]);
        }

    }
}