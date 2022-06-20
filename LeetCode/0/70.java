// For Leet submit template

class Main {

      public static void main(String[] args) {
            int n = 35;
            long cnt = 0;
            int one = n;
            int two = 0;

            // while (n > 0 && one >= 0) {
            // if (n - 1 == 0) {
            // // odd
            // one++;
            // cnt += factorial(one + two) / (factorial(one) * factorial(two));
            // System.out.println(cnt);
            // break;
            // }

            // cnt += factorial(one + two) / (factorial(one) * factorial(two));
            // System.out.println("One : " + one + "Two : " + two);
            // System.out.println(factorial(one + two) / (factorial(one) * factorial(two)));
            // System.out.println(cnt);
            // one -= 2;
            // two++;
            // }

            while (one >= 0) {
                  if (n - 1 == 0) {
                        // odd
                        one++;
                        cnt += factorial(one, two);
                        System.out.println(
                                    "current result : " + factorial(one, two));
                        System.out.println("cnt" + cnt);
                        System.out.println();
                        break;
                  }

                  cnt += factorial(one, two);
                  System.out.println("current result : " + factorial(one, two));
                  System.out.println("cnt: " + cnt);
                  System.out.println();
                  one -= 2;
                  two++;

            }
            System.out.println(cnt);
      }

      public static long factorial(int one, int two) {
            System.out.println("One : " + one + " / Two : " + two + "in factrial");
            int large = (one > two) ? one : two;
            int small = (one > two) ? two : one;

            long facto1 = 1;
            long facto2 = 1;

            for (int i = (one + two); i > (one + two) - large; i--) {
                  facto1 *= i;
            }

            for (int i = small; i > 1; i++) {
                  facto2 *= i;
            }

            if (facto2 == 0) {
                  return facto1;
            }

            return facto1 / facto2;
      }
}