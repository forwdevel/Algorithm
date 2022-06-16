
// For Algorithm submit template

class Main {
      public static void main(String[] args) {
            int left = 24;
            int right = 27;

            int answer = 0;
            int cnt = 0;

            for (int i = left; i <= right; i++) {
                  for (int j = 1; j <= Math.sqrt(i); j++) {

                        if (i % j == 0) {
                              cnt++;
                              if (j * j == i) {
                                    cnt++;
                              }
                              System.out.print(j + " ");
                        }
                  }
                  if (cnt % 2 == 0) {
                        // even
                        answer += i;
                  } else {
                        answer -= i;
                  }
                  cnt = 0;
            }

            System.out.println(answer);
      }
}