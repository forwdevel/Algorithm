import java.util.*;

class MyObject {
      String sentence;
      int idx;

      MyObject(String sentence, int idx) {
            this.sentence = sentence;
            this.idx = idx;
      }
}

class Solution {
      public static String sortSentence(String s) {
            List<MyObject> temp = new ArrayList<MyObject>();

            System.out.println(s.charAt(19));
            System.out.println(s.charAt(20));

            while (s.length() != 0) {
                  for (int i = 1; i < s.length(); i++) {
                        if (s.charAt(i) == ' ' && s.charAt(i - 1) <= '9' && s.charAt(i - 1) >= '0') {
                              // if (s.charAt(i) == ' ' && s.charAt(i - 1) <= '9' && s.charAt(i - 1) >= '0') {
                              System.out.println("substring: " + (s.substring(0, i - 1)));
                              System.out.println("charAt(i): " + s.charAt(i));
                              System.out.println("charAt(i - 1): " + s.charAt(i - 1));
                              MyObject e = new MyObject(s.substring(0, i - 1), s.charAt(i - 1) - '0');
                              temp.add(e);
                              s = s.substring(i + 1, s.length());
                              break;
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

            MyObject e = new MyObject(s.substring(0, s.length() - 1), s.charAt(s.length() - 1) - '0');
            temp.add(e);
            s = "";

            System.out.println("temp size : " + temp.size());

            Collections.sort(temp, new IntegerComp());

            for (int i = 0; i < temp.size(); i++) {
                  s += temp.get(i).sentence + " ";
            }

            // Remove the last white space
            return s.substring(0, s.length() - 1);
      }

      public static void main(String[] args) {
            String s = "KmPGxjHIpz2 xyicowi3 RULgvi1 DEMNWWBvRobvMSzOw5 tMWpM6 PRarH4";
            System.out.println(sortSentence(s));
      }
}

class IntegerComp implements Comparator<MyObject> {

      @Override
      public int compare(MyObject o1, MyObject o2) {
            if (o1.idx - o2.idx < 0)
                  return -1;
            else if (o1.idx - o2.idx > 0)
                  return 1;
            else
                  return 0;
      }

}