import java.util.*;

class Solution {
      String sentence;
      int idx;

      Solution(String sentence, int idx) {
            this.sentence = sentence;
            this.idx = idx;
      }

      public static String sortSentence(String s) {
            List<Solution> temp = new ArrayList<Solution>();

            while (s.length() != 0) {
                  for (int i = 1; i < s.length(); i++) {
                        if (s.charAt(i) == ' ' && s.charAt(i - 1) <= '9' && s.charAt(i - 1) >= '0') {
                              Solution e = new Solution(s.substring(0, i - 1), s.charAt(i - 1) - '0');
                              temp.add(e);
                              s = s.substring(i + 1, s.length());
                        }

                  }
                  boolean end = true;
                  for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == ' ') {
                              end = false;
                        }
                  }
                  if (end == true) {
                        break;
                  }
            }

            Solution e = new Solution(s.substring(0, s.length() - 1), s.charAt(s.length() - 1) - '0');
            temp.add(e);
            s = "";

            System.out.println("temp size : " + temp.size());

            Collections.sort(temp, new IntegerComp());

            for (int i = 0; i < temp.size(); i++) {
                  s += temp.get(i).sentence + " ";
            }

            return s;
      }

      public static void main(String[] args) {
            String s = "Myself2 Me1 I4 and3";

            System.out.println(sortSentence(s));
      }
}

class IntegerComp implements Comparator<Solution> {

      @Override
      public int compare(Solution o1, Solution o2) {
            if (o1.idx - o2.idx < 0)
                  return -1;
            else if (o1.idx - o2.idx > 0)
                  return 1;
            else
                  return 0;
      }

}