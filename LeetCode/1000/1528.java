// For Leet submit template

import java.util.*;

class Solution {
      public static String restoreString(String s, int[] indices) {
            String answer = "";
            int target = 0;

            while (answer.length() != s.length()) {
                  for (int i = 0; i < indices.length; i++) {
                        if (target == indices[i]) {
                              answer += s.charAt(i);
                              target++;
                              break;
                        }
                  }
            }

            System.out.println(answer.charAt(5) + " " + answer.charAt(6));
            System.out.println(s.charAt(indices[5]) + " " + s.charAt(indices[6]));
            System.out.println(Arrays.toString(indices));

            return answer;
      }

      public static void main(String[] args) {
            String s = "codeleet";
            int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

            System.out.println(restoreString(s, indices));

      }
}