
// For Algorithm submit template
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
      public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            StringBuffer sb = new StringBuffer();

            int n = Integer.parseInt(bf.readLine());

            for (int i = 0; i < n; i++) {
                  int a = Integer.parseInt(bf.readLine());
                  int b = Integer.parseInt(bf.readLine());
                  sb.append(a + b).append("\n");
            }

            System.out.println(sb);

      }
}