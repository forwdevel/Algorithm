class Solution {
      public int finalValueAfterOperations(String[] operations) {
            int x = 0;
            for (int i = 0; i < operations.length; i++) {
                  if (operations[i].equals("--X")) {
                        --x;
                        System.out.println("--x: " + x);
                        System.out.println("i: " + i);
                  } else if (operations[i].equals("X--")) {
                        x--;
                        System.out.println("x-- " + x);
                        System.out.println("i: " + i);
                  } else if (operations[i].equals("++X")) {
                        ++x;
                        System.out.println("++x: " + x);
                        System.out.println("i: " + i);
                  } else {
                        x++;
                        System.out.println("x++: " + x);
                        System.out.println("i: " + i);
                  }
            }

            return x;
      }
}