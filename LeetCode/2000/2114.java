class Solution {
      public int mostWordsFound(String[] sentences) {
            int s = 1;
            int max = 1;

            for (int i = 0; i < sentences.length; i++) {
                  for (int j = 0; j < sentences[i].length(); j++) {
                        if (sentences[i].charAt(j) == ' ') {
                              s++;
                        }
                  }

                  if (max < s) {
                        max = s;
                  }

                  s = 1;
            }

            return max;
      }
}